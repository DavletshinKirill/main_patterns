package dev.davletshin;

import dev.davletshin.adapter.Computer;
import dev.davletshin.adapter.MemoryCard;
import dev.davletshin.factory.Coffee;
import dev.davletshin.factory.CoffeeEnum;
import dev.davletshin.factory.CoffeeFactory;
import dev.davletshin.factory.CoffeeSize;
import dev.davletshin.proxy.DatabaseConnectorImpl;
import dev.davletshin.proxy.ProxyConnector;
import dev.davletshin.singleton.Checker;
import dev.davletshin.singleton.LogData;
import dev.davletshin.singleton.LogLevel;

public class Main {
    public static void main(String[] args) {
        LogData logger = LogData.getInstance();
        Checker check = new Checker("data");
        String string = "string";
        logger.logInfo(check, "some info", LogLevel.INFO);
        logger.logInfo(string, "some info", LogLevel.ERROR);

        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee espresso = coffeeFactory.createCoffee(CoffeeEnum.ESPRESSO, CoffeeSize.LARGE);
        espresso.boil();
        Coffee americano = coffeeFactory.createCoffee(CoffeeEnum.AMERICANO, CoffeeSize.SMALL);
        americano.boil();

        ProxyConnector proxyConnector = new ProxyConnector();
        proxyConnector.connectToDatabase("nameDataBase");

        DatabaseConnectorImpl databaseConnector = new DatabaseConnectorImpl();
        databaseConnector.connectToDatabase("postgres://username:password@localhost:5432/database_name");

        MemoryCard memoryCard = new MemoryCard();
        Computer computer = new Computer(memoryCard);
        computer.readUSB();
    }
}