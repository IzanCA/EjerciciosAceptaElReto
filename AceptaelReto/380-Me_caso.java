import java.util.Scanner;

public class Ejercicio380Boda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            int[] a1 = new int[n];
            if (n != 0) {
                int suma = 0;
                for (int i = 0; i < n; i++) {
                    a1[i]=sc.nextInt();
                        suma = suma + a1[i];
                    
                }
                System.out.println(suma);
            }
        } while (n != 0);
}
}
