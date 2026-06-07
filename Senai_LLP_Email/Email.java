
import java.util.Scanner;

public class Email {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos emails você quer inserir?");
        int n = leitor.nextInt();
        String[] emails = new String[n];

        for(int i = 0; i < n; i++){
            String email = leitor.next();

            while(!email.contains("@")){
                System.out.println("Insera um email valido: ");
                email = leitor.next();
            }

            emails[i] = email;

        }

        for(int i = 0; i < n; i++ ){

            int posicao = emails[i].indexOf("@");
            String local = emails[i].substring(0, posicao);
            String dominio = emails[i].substring(posicao + 1);

            if(local.contains("+")){
                int mais = local.indexOf("+");
                local = local.substring(0, mais);
            }
            
            if(local.contains(".")){
                local = local.replace(".", "");
            }

            String emailFinal = local + "@" + dominio;

            emails[i] = emailFinal;

        }

        int conta = 0;
        for(int i = 0; i < n; i++){

            boolean repetido = false;

            for(int x = 0; x < i; x++){

                if(emails[i].equals(emails[x])){
                    repetido = true;
                }

            }
            
            if(!repetido){
                    conta++;
                }

        }

        System.out.println(conta);

    }

}