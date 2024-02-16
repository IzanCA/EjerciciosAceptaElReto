import java.util.*;

public class LigaPadel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String categoria;
        TreeMap<String, Integer> lp = new TreeMap<>();
        int numPar;
        do {
            categoria = sc.nextLine();
            if (!categoria.equals("FIN")) {
                numPar = setEquipos(lp, sc);
                System.out.println(setGanador(lp, numPar));
                lp.clear();
            }
        } while (!categoria.equals("FIN"));
    }

    public static int setEquipos(TreeMap<String, Integer> lp, Scanner sc) {
        String res;
        int numPar = 0;
        do {
            res = sc.nextLine();
            if (!res.equals("FIN")) {
                numPar++;
                String[] resPartido = res.split(" ");
                if (Integer.parseInt(resPartido[1]) > Integer.parseInt(resPartido[3])) {
                    addPuntos(lp , resPartido[0] , resPartido[2]);
                }else addPuntos(lp , resPartido[2] , resPartido[0]);
            }
        } while (!res.equals("FIN"));
        return numPar;
    }
    
    public static void addPuntos(TreeMap<String, Integer> lp , String winner, String looser){
        int temPuntos;
        if (lp.containsKey(winner)) {
            temPuntos = lp.get(winner);
            lp.put(winner, temPuntos + 2);
        } else lp.put(winner, 2);
        if (lp.containsKey(looser)) {
            temPuntos = lp.get(looser);
            lp.put(looser, temPuntos + 1);
        } else lp.put(looser, 1);
    }

    public static String setGanador(TreeMap<String, Integer> lp, int nPar) {
        int max = Integer.MIN_VALUE;
        String winner = "";
        for (String key : lp.keySet()) {
            if (lp.get(key) > max) {
                max = lp.get(key);
                winner = key;
            } else if (lp.get(key) == max) {
                winner = "EMPATE";
            }
        }
        int resMatch = (lp.size() * (lp.size() - 1)) - nPar;
        return winner + " " + resMatch;
    }
}
