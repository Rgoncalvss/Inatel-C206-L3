import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int x;

        System.out.println("Entre com um numero: ");

        x = valor.nextInt();

        if(x == 1)
        {
            System.out.println("Pedra");
        }
        else if(x == 2)
        {
            System.out.println("Papel");
        }
        else if(x == 3)
        {
            System.out.println("Tesoura");
        }
        else
        {
            System.out.println("NULL");
        }
        valor.close();
    }
}
