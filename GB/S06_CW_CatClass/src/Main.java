import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        var cat1 = new CatVet("Barsik", "Grey");
        var cat2 = new CatVet("Barsik", "Grey");
        var cat3 = new CatVet("Barsic", "Grey");
        var cat4 = new CatVet("Dushka", "White");
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat4.hashCode());

        HashSet<CatVet> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        System.out.println(cats);
    }
}
