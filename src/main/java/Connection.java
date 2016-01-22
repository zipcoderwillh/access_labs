/**
 * Created by willhorton on 1/22/16.
 */
public class Connection {

    private final int ID;
    private int portNumber;
    private String ipAddress;

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Connection(int ID) {
        this.ID = ID;
        this.portNumber = 0;
        this.ipAddress = "0.0.0.0";
    }

    public Connection(int ID, int portNumber, String ipAddress) {
        this.ID = ID;
        this.portNumber = portNumber;
        this.ipAddress = ipAddress;
    }

}