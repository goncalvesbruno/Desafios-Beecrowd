import java.util.Locale;
import  java.util.Scanner;
import java.lang.Math;

public class CircleArea {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        double n = 3.14159;
        double r = scan.nextDouble();
        double area = n*(Math.pow(r,2));

        System.out.println("A=" + String.format("%.4f", area));
        scan.close();

    }
}