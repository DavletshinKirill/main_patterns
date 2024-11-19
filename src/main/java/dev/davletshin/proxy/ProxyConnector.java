package dev.davletshin.proxy;

public class ProxyConnector implements DatabaseConnector{

    @Override
    public void connectToDatabase(String url) {
        String password = "password";
        String username = "username";
        String fullConnectionString = String.format("ppostgresql://%s:%s@localhost:5432/%s", username, password, url);
        System.out.println("ProxyConnector");
        System.out.println("Connecting to " + fullConnectionString);
    }
}
