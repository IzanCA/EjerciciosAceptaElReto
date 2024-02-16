import java.util.Scanner;

public class Ejercicio371Cerillas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            int palo = 0;
            n = sc.nextInt();
            if (n != 0) {
                for (int i = n; i > 0; i--) {
                    palo = palo + i;
                }
                palo = palo * 3;
                System.out.println(palo);
            }
        } while (n != 0);
    }
}
