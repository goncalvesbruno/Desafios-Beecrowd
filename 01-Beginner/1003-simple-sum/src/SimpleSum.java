import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int soma = x+y;

        System.out.println("SOMA = " + soma);

       scan.close();
    }
}
