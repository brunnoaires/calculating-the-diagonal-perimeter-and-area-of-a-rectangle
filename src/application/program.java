package application;
import entities.retangulo;
import java.util.Scanner;
import java.util.Locale;
public class program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        retangulo x;
        x = new retangulo();

        System.out.print("Insira o primeiro valor do retagunlo: ");
        x.b = sc.nextDouble();
        System.out.print("Insira o segundo valor do retagunlo: ");
        x.h = sc.nextDouble();

        System.out.printf("Area = %.2f%n",x.area());
        System.out.printf("Perimeter = %.2f%n",x.perimeter());
        System.out.printf("Diagonal = %.2f%n",x.diagonal());
        sc.close();
    }
}
