import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadz pierwsza liczbe");
        int a= in.nextInt();
        System.out.println("Wprowadz druga liczbe");
        int b= in.nextInt();


        {
            System.out.print("Wynik: ");
            System.out.print(a+b);
        }
    }
}