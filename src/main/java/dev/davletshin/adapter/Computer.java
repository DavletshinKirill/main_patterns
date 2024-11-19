package dev.davletshin.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Computer implements USB{
    private final MemoryCard memoryCard;

    @Override
    public void readUSB() {
        memoryCard.insert();
    }
}
