import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.println("Area do retangulo: " + area);
    }
}