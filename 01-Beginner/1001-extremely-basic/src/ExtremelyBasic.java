import java.util.Scanner;

public class ExtremelyBasic {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("X = " + (x+y));
        scan.close();
    }
}
