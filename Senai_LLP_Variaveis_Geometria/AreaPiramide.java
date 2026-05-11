import java.util.Scanner;

public class AreaPiramide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double alturaLateral = sc.nextDouble();

        double areaBase = base * base;
        double areaLateral = 2 * base * alturaLateral;

        double areaTotal = areaBase + areaLateral;

        System.out.println("Area da piramide: " + areaTotal);
    }
}