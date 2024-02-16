import java.util.Scanner;

public class Ejercicio216goteras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        int segsRegistrados;
        for (int i = 0; i < n; i++) {
            segsRegistrados = sc.nextInt();
            int horas = 00, mins = 00, segsTemp = 00, resto;

            horas = segsRegistrados / 3600;
            resto = segsRegistrados % 3600;
            mins = resto / 60;
            segsTemp = resto % 60;
 
            System.out.printf("%02d:%02d:%02d%n",horas,mins,segsTemp);
        }
    }
}
