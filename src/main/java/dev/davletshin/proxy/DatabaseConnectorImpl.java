package dev.davletshin.proxy;

public class DatabaseConnectorImpl implements DatabaseConnector {
    @Override
    public void connectToDatabase(String url) {
        System.out.println("DatabaseConnectorImpl");
        System.out.println("Connecting to " + url);
    }
}
