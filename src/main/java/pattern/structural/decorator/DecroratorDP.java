package pattern.structural.decorator;

abstract class Pizza {
    abstract double cost();
}

class ThinCrustPizza extends Pizza {
    @Override
    double cost() {
        return 4;
    }
}

class ThickCrustPizza extends Pizza {
    @Override
    double cost() {
        return 5;
    }
}

class MediumCrustPizza extends Pizza {
    @Override
    double cost() {
        return 4.5;
    }
}

abstract class ToppingDecorator extends Pizza {
    protected final Pizza basePizza;

    public ToppingDecorator(Pizza pizza) {
        this.basePizza = pizza;
    }
}

class PineAppleDecorator extends ToppingDecorator {
    public PineAppleDecorator(Pizza p) {
        super(p);
    }

    @Override
    double cost() {
        return 0.5 + basePizza.cost();
    }

}

class CheeseDecorator extends ToppingDecorator {
    public CheeseDecorator(Pizza p) {
        super(p);
    }

    @Override
    double cost() {
        return 0.25 + basePizza.cost();
    }

}

class ChickenDecorator extends ToppingDecorator {
    public ChickenDecorator(Pizza p) {
        super(p);
    }

    @Override
    double cost() {
        return 3 + basePizza.cost();
    }
}

public class DecroratorDP {
    // chicken pineapple pizza with thin crust
    public static void main(String[] args) {
        Pizza cheesePineAppleThinCrust = new CheeseDecorator(new PineAppleDecorator(new MediumCrustPizza()));
        Pizza chickenPineAppleThickCrust = new ChickenDecorator(new PineAppleDecorator(new ThickCrustPizza()));

        System.out.println(cheesePineAppleThinCrust.cost());
    }
 }
