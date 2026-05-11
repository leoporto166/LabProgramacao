import java.util.Scanner;

public class AreaBola {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        double area = 4 * 3.14159 * raio * raio;

        System.out.printf("Area da bola: %.2f%n", area);
    }
}