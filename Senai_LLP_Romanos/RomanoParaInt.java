import java.util.Scanner;

public class RomanoParaInt {

    public static int AlgarismoRomanoParaInteiro(String s) {
        int total = 0;
        int anterior = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int atual = valorRomano(s.charAt(i));

            if (atual < anterior) {
                total -= atual;
            } else {
                total += atual;
            }

            anterior = atual;
        }

        return total;
    }

    public static int valorRomano(char letra) {
        switch (letra) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        if (args.length > 0) {
            String algarismos = String.join("", args);
            int valor = AlgarismoRomanoParaInteiro(algarismos);
            System.out.println(valor);
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o algarismo: ");
        String algarismos = sc.nextLine();

        int valor = AlgarismoRomanoParaInteiro(algarismos);
        System.out.println(valor);
    }
}