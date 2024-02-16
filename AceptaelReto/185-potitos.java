import java.util.*;

public class potitos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String linea;
        TreeSet<String> ingSI = new TreeSet<String>();
        TreeSet<String> ingNO = new TreeSet<String>();

        do {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                for (int i = 0; i < n; i++) {

                    linea = sc.nextLine();

                    String[] palabras = linea.split(" ");

                    for (int j = 1; j < palabras.length; j++) {
                        if (!palabras[j].equals("FIN")) {
                            if (palabras[0].equals("SI:")) {
                                ingSI.add(palabras[j]);
                            } else {
                                ingNO.add(palabras[j]);
                            }
                        }
                    }
                }
                mostrar(ingSI, ingNO);
                ingSI.clear();
                ingNO.clear();

            }
        } while (n != 0);
    }

    public static void mostrar(TreeSet<String> ingSI, TreeSet<String> ingNO) {
        for (String ingTmp : ingSI) {
            ingNO.remove(ingTmp);
        }
        String salida = "";
        for (String string : ingNO) {
            salida += string + " ";
        }
        System.out.println(salida.trim());
    }
}
