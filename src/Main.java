import java.util.*;
import java.util.function.*;


public class Main {
    public static void main(String args[]) {
        Hero hero1 = new Hero("Itchi",9);
        Hero hero2 = new Hero("Pain",10);
        Hero hero3 = new Hero("Hidan",6);
        Hero hero4 = new Hero("Zabuza",6);
        ArrayList <Hero> heros = new ArrayList<>();
        heros.add(hero1);
        heros.add(hero2);
        heros.add(hero3);
        hero4.go(heros, new Predicate<Hero>() {
            @Override
            public boolean test(Hero hero) {
                return hero.getStrong() > 7;
            }
        });

        hero4.go(heros, (Hero x) -> x.getStrong() >7);





    }
}
class Hero {
    String name;
    int strong;
    public Hero (String name, int strong) {
        this.name = name;
        this.strong = strong;
    }

    public String getName() {
        return name;
    }

    public int getStrong() {
        return strong;
    }

    public  void go (ArrayList <Hero> tt, Predicate <Hero> pred ) {
        for (Hero x : tt) {
            if (pred.test(x )) {
                System.out.println(x);
            }
        }

    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", strong=" + strong +
                '}';
    }
}







