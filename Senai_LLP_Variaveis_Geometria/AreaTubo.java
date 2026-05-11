import java.util.Scanner;

public class AreaTubo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double altura = sc.nextDouble();

        double area = 2 * 3.14159 * raio * (raio + altura);

        System.out.printf("Area do tubo: %.2f%n", area);
    }
}