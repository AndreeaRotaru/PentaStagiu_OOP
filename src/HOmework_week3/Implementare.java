package HOmework_week3;

public class Implementare {

    public static void main(String[] args) {
        Mercur m = new Mercur(234);
        Terra t = new Terra(569);
        System.out.println(m.NumeTemperatura);
        System.out.println(t.NumeAtmosfera);

        SistemSolar s = new SistemSolar();
        System.out.println(s.myMethod());
        System.out.println(s.myMethod2());
        System.out.println(s.myMethod3());
        t.luminaSolara();
    }
}
