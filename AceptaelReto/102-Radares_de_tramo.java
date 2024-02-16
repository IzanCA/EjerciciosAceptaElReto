import java.util.Scanner;

public class Ejercicio112 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n;
        String entrada;
        int velMax, m, t;
        double velocidad;
        do {
            entrada = sc.nextLine();
            n = entrada.split(" ");

            velMax = Integer.parseInt(n[1]);
            m = Integer.parseInt(n[0]);
            t = Integer.parseInt(n[2]);
            velocidad = kmh(Integer.parseInt(n[0]), Integer.parseInt(n[2]));
            if (!entrada.equals("0 0 0")) {
                if (velMax > 0 && m > 0 && t > 0) {

                    if (velocidad < velMax) {
                        System.out.println("OK");
                    } else if (velocidad > velMax) {
                        if (velocidad < (velMax * 1.20)) {
                            System.out.println("MULTA");
                        } else if (velocidad >= velMax * 1.20d) {
                            System.out.println("PUNTOS");
                        }
                    }
                } else {
                    System.out.println("ERROR");
                }
            }

        } while (!entrada.equals("0 0 0"));
    }

    public static double kmh(int distancia, int s) {
        double v, km, h;
        km = distancia / 1000d;
        h = s / 3600d;
        v = km / h;
        return v;
    }
}
