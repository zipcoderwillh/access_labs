import java.util.ArrayList;

/**
 * Created by willhorton on 1/22/16.
 */
public class ConnectionManager {

    private static Connection[] connections = new Connection[5];
    private static int connectionCount = 0;

    public static Connection openConnection() {

        // Check if already have max number of connections
        if(connectionCount == 5) return null;

        // Create new connection
        Connection newCon = new Connection(++connectionCount);

        // Append to first free space in array
        for(int i = 0; i < connections.length; i++) {
            if(connections[i] == null) {
                connections[i] = newCon;
                break;
            }
        }

        return newCon;

    }

    public static void closeConnection(int ID) {



    }

    public static void displayConnections() {

    }

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            System.out.println(ConnectionManager.openConnection());
        }

        System.out.println(ConnectionManager.openConnection());

    }

}