package dev.davletshin.factory;

public class Americano extends Coffee {

    public Americano(CoffeeSize size) {
        super(size, 80);
    }

    @Override
    public void boil() {
            System.out.printf("""
                Boiling:
                Name: Americano
                Size: %s
                Price: %s
                %n""",  size, price);
    }
}
