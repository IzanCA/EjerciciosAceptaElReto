import java.util.*;


public class FelipeYsusTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        int tmp = 0, pri = 0;
        ArrayList<tarea> p = new ArrayList<tarea>();
        do {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                for (int i = 0; i < n; i++) {
                    tmp = sc.nextInt();
                    pri = sc.nextInt();
                    sc.nextLine();
                    p.add(new tarea(tmp, pri));
                }
                Collections.sort(p);
                for (tarea o : p) {
                    System.out.println(o.gettmp()+ " " + o.getpri());
                }
                System.out.println("---");
                p.clear();
            }
        } while (n != 0);
    }
}

class tarea implements Comparable {

    private int tmp;
    private int pri;
    
    public tarea(int tmp, int pri) {
        this.tmp = tmp;
        this.pri = pri;
    }
    @Override
    public int compareTo(Object o) {
        tarea otro = (tarea) o;
        if (this.tmp != otro.gettmp()) {
            return Integer.compare(otro.gettmp(), this.gettmp());
        } else {
            return Integer.compare(this.getpri(), otro.getpri());
        }
    }
    public int gettmp() {
        return tmp;
    }
    public void settmp(int tmp) {
        this.tmp = tmp;
    }
    public int getpri() {
        return pri;
    }
    public void setpri(int pri) {
        this.pri = pri;
    }
}
