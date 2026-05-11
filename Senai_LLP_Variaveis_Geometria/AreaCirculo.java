import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        double area = 3.14159 * raio * raio;

        System.out.printf("Area do circulo: %.2f%n", area);
    }
}