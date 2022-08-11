import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int x;

        do{
            x = valor.nextInt();
            if(x != 7)
                System.out.println("Numero incorreto");
        }while(x != 7);
        System.out.println("Numero correto");
        valor.close();
    }
    }
