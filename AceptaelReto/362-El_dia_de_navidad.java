import java.util.Scanner;

public class Ejercicio362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         int n;
         n = Integer.parseInt(sc.nextLine());
         String fecha, navidad = "25 12";
         for (int i = 0; i < n; i++) {
             fecha = sc.nextLine();
             if (fecha.equals(navidad)) {
                 System.out.println("SI");
             } else if (!fecha.equals(navidad)) {
                 System.out.println("NO");
             }
         }
}
}
