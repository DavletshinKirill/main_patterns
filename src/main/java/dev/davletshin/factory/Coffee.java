package dev.davletshin.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Coffee {
    protected CoffeeSize size;
    protected double price;

    public abstract void boil();
}
