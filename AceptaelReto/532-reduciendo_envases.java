import java.util.Scanner;

public class Ejercicio532 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        String[] peso;
        
        for (int i = 0; i < n; i++) {
            peso = sc.nextLine().split(" ");
            System.out.println(Integer.parseInt(peso[1]) - Integer.parseInt(peso[0]));      
        }
    }
}
