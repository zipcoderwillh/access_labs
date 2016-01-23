import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by willhorton on 1/22/16.
 */
public class ConnectionManagerTest {

    @Test
    public void openConnectionTest() {
        // Test that returns a connection
        Connection testConnection1 = ConnectionManager.openConnection();
        assertTrue(testConnection1 instanceof Connection);

        // Test that returns null if no more connections available
        // First fill up all available slots
        Connection testConnection2 = ConnectionManager.openConnection();
        Connection testConnection3 = ConnectionManager.openConnection();
        Connection testConnection4 = ConnectionManager.openConnection();
        Connection testConnection5 = ConnectionManager.openConnection();
        assertNull(ConnectionManager.openConnection());
    }


    @Test
    public void closeConnectionTest() {
        ConnectionManager.closeConnection(4);
        assertEquals("Sorry, connection 4 was not found\n", ConnectionManager.displayConnection(4));
    }


    @Test
    public void displayConnectionTest() {
        Connection testConnection6 = ConnectionManager.openConnection();
        assertEquals("Connection ID: 6\nConnection port: 0\nConnection IP address: 0.0.0.0\n", ConnectionManager.displayConnection(6));
    }

}
