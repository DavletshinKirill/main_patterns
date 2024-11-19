package dev.davletshin.factory;

public class CoffeeFactory {
    public Coffee createCoffee(CoffeeEnum type, CoffeeSize size) {
        Coffee coffee;
        switch (type) {
            case AMERICANO -> {
                coffee = new Americano(size);
            }
            case ESPRESSO -> {
                coffee = new Espresso(size);
            }
            default -> throw new IllegalArgumentException("Неизвестный тип кофе: " + type);
        }
        return coffee;
    }
}
