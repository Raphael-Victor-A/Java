import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj  = new Scanner(System.in);
        System.out.println("Digite os dois valores da soma: ");
        
        int numero1 = myObj.nextInt();
        int numero2 = myObj.nextInt();
        int soma = numero1 + numero2;
        System.out.println("Resultado: "+ soma);

        while(soma < 1000){
            soma++;
            System.out.println(soma);
        }
        
        
    }
}
