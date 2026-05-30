import java.util.ArrayList;
import java.util.Scanner;

public class Receita {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        ArrayList<String> ingredientes = new ArrayList<>();
        ArrayList<String> quantidades = new ArrayList<>();
        ArrayList<String> passos = new ArrayList<>();

        String ingrediente;
        String quantidade;

        System.out.print("Receita: ");
        String receita = leitor.nextLine();
        while(true){

            System.out.print("Digite um ingrediente: ");
            ingrediente = leitor.nextLine();
            if (ingrediente.isEmpty()) {
                break;
            }
            System.out.print("Digite a quantidade: ");
            quantidade = leitor.nextLine();

            
            ingredientes.add(ingrediente);
            quantidades.add(quantidade);



        }

        String passo;
        while(true){

            
            System.out.print("Digite um passo: ");
            passo = leitor.nextLine();
            if (passo.isEmpty()) {
                break;
            }

            
            passos.add(passo);


        }

        System.out.println();
        System.out.println(receita);
        System.out.println();

        System.out.println("Ingredientes:");
        for (int i = 0; i < ingredientes.size(); i++) {
            System.out.println((i + 1) + ". " + ingredientes.get(i) + " - " + quantidades.get(i));
        }

        System.out.println();

        System.out.println("Instruções:");
        for (int i = 0; i < passos.size(); i++) {
            System.out.println("Passo " + (i + 1) + ": " + passos.get(i));
        }


    }

}