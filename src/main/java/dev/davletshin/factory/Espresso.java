package dev.davletshin.factory;

public class Espresso extends Coffee{

    public Espresso(CoffeeSize size) {
        super(size, 100);
    }

    @Override
    public void boil() {
        System.out.printf("""
                Boiling:
                Name: Espresso
                Size: %s
                Price: %s
                %n""",  size, price);
    }
}
