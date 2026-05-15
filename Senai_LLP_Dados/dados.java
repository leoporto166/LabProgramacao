
import java.util.Random;


public class dados{

    public static void main(String[] args) {

        Random gerador = new Random();
        if(args.length == 0){
            System.out.println("Digete algo");
        }

        int Qdados = Integer.parseInt(args[0]);
        int nDado;
        for(int i = 0; i < Qdados; i++){
            nDado = gerador.nextInt(1, 6);

            switch (nDado) {
                case 1:
                    System.out.println("+-------+");
                    System.out.println("|       |");
                    System.out.println("|   o   |");
                    System.out.println("|       |");
                    System.out.println("+-------+");
                    break;

                case 2:
                    System.out.println("+-------+");
                    System.out.println("| o     |");
                    System.out.println("|       |");
                    System.out.println("|     o |");
                    System.out.println("+-------+");
                    break;

                case 3:
                    System.out.println("+-------+");
                    System.out.println("| o     |");
                    System.out.println("|   o   |");
                    System.out.println("|     o |");
                    System.out.println("+-------+");
                    break;

                case 4:
                    System.out.println("+-------+");
                    System.out.println("| o   o |");
                    System.out.println("|       |");
                    System.out.println("| o   o |");
                    System.out.println("+-------+");
                    break;

                case 5:
                    System.out.println("+-------+");
                    System.out.println("| o   o |");
                    System.out.println("|   o   |");
                    System.out.println("| o   o |");
                    System.out.println("+-------+");
                    break;

                case 6:
                    System.out.println("+-------+");
                    System.out.println("| o   o |");
                    System.out.println("| o   o |");
                    System.out.println("| o   o |");
                    System.out.println("+-------+");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}