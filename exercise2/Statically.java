
public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    private static String glue = "Epoxy";

    private String jello = "Jello";

    void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    static void stubborn() {
        Statically statically = new Statically();
        statically.moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }

    static void explain() {
        stubborn();
        System.out.println(glue);
    }

    static String glue() {
        return glue;
    }

    public static void main(String[] args) {
        Statically stats = new Statically();

        stats.moveAndShake();
        Statically.stubborn();
        Statically.explain();

        System.out.println(Statically.glue);
        System.out.println(stats.jello);
    }
}
