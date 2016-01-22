import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by willhorton on 1/22/16.
 */
public class ConnectionManagerTest {

    @Test
    public void openConnectionTest() {

        // Test that returns a connection
        Connection testConnection = ConnectionManager.openConnection();
        assertTrue(testConnection instanceof Connection);

        // Test that returns null if no more connections available
        for(int i = 0; i < 5; i++) {
            Connection fillConnections = ConnectionManager.openConnection();
        }
        assertNull(ConnectionManager.openConnection());
    }

    @Test
    public void closeConnectionTest() {

    }

    @Test
    public void displayConnectionsTest() {

    }

}
