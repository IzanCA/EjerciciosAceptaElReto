import java.util.Scanner;

public class Ejercicio595 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
         n = Integer.parseInt(sc.nextLine());
         int vol;
         for (int i = 0; i < n; i++) {
             vol = sc.nextInt();
             
             System.out.println(vol/100);
         }
}
}
