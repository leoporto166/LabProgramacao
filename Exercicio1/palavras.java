public class palavras {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Informe um texto nos argumentos.");
            return;
        }

        String texto = String.join(" ", args);

        String[] palavras = texto.split("\\s+");

        int quantidadePalavras = 0;
        int quantidadeVogais = 0;
        int palavrasPares = 0;
        int palavrasImpares = 0;

        for (String palavra : palavras) {

            palavra = palavra.replaceAll("[^a-zA-Z]", "");

            if (!palavra.isEmpty()) {

                quantidadePalavras++;

                int tamanho = palavra.length();

                if (tamanho % 2 == 0) {
                    palavrasPares++;
                } else {
                    palavrasImpares++;
                }

                for (char letra : palavra.toLowerCase().toCharArray()) {

                    if (letra == 'a' || letra == 'e' || letra == 'i'
                            || letra == 'o' || letra == 'u') {

                        quantidadeVogais++;
                    }
                }
            }
        }

        System.out.println("Quantidade de palavras: " + quantidadePalavras);
        System.out.println("Quantidade de vogais: " + quantidadeVogais);
        System.out.println("Palavras com quantidade par de letras: " + palavrasPares);
        System.out.println("Palavras com quantidade ímpar de letras: " + palavrasImpares);
    }
}