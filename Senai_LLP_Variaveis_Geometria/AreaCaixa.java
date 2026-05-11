import java.util.Scanner;

public class AreaCaixa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double comprimento = sc.nextDouble();
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        double area = 2 * (comprimento * largura +
                           comprimento * altura +
                           largura * altura);

        System.out.println("Area da caixa: " + area);
    }
}