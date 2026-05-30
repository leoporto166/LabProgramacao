import java.io.*;
import java.util.*;

class Time {
    String nome;
    int pontos;
    int golsFeitos;
    int golsSofridos;

    Time(String nome) {
        this.nome = nome;
    }

    int saldo() {
        return golsFeitos - golsSofridos;
    }
}

public class Main {
    public static void main(String[] args) {
        Map<String, Time> tabela = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("jogos.txt"))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");

                if (dados.length < 4) continue;

                String timeA = dados[1].trim();
                String timeB = dados[2].trim();
                String resultado = dados[3].trim();

                if (!resultado.matches("\\d+x\\d+")) continue;

                String[] gols = resultado.split("x");
                int golsA = Integer.parseInt(gols[0]);
                int golsB = Integer.parseInt(gols[1]);

                tabela.putIfAbsent(timeA, new Time(timeA));
                tabela.putIfAbsent(timeB, new Time(timeB));

                Time a = tabela.get(timeA);
                Time b = tabela.get(timeB);

                a.golsFeitos += golsA;
                a.golsSofridos += golsB;

                b.golsFeitos += golsB;
                b.golsSofridos += golsA;

                if (golsA > golsB) {
                    a.pontos += 3;
                } else if (golsB > golsA) {
                    b.pontos += 3;
                } else {
                    a.pontos += 1;
                    b.pontos += 1;
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        List<Time> times = new ArrayList<>(tabela.values());

        times.sort((t1, t2) -> {
            if (t2.pontos != t1.pontos) {
                return t2.pontos - t1.pontos;
            }
            return t2.saldo() - t1.saldo();
        });

        System.out.println("+-----+------------------------+--------+-------+");
        System.out.println("| #   | Time                   | Pontos | Saldo |");
        System.out.println("+-----+------------------------+--------+-------+");

        int posicao = 1;
        for (Time time : times) {
            System.out.printf(
                "| %-3s | %-22s | %-6d | %-5d |\n",
                posicao + "º",
                time.nome,
                time.pontos,
                time.saldo()
            );
            posicao++;
        }

        System.out.println("+-----+------------------------+--------+-------+");
    }
}