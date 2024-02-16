import java.util.Scanner;

public class Ejercicio155Perimetro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n;
        String[] a;
        do {

            n = sc.nextLine();

            a = n.split(" ");

            if (Integer.parseInt(a[0]) >= 0 && Integer.parseInt(a[1]) >= 0) {
                int num1 = Integer.parseInt(a[0]);
                int num2 = Integer.parseInt(a[1]);

                int calc = (num1 * 2) + (num2 * 2);

                System.out.println(calc);
            }

        } while (Integer.parseInt(a[0]) >= 0 && Integer.parseInt(a[1]) >= 0);
    }
}
