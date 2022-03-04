
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DbConnect {

  private Connection conn = null;
  private Statement stmt = null;

  public DbConnect(String db) throws ClassNotFoundException {
    String driver = "jdbc:ucanaccess://" + db;

    try {
      conn = DriverManager.getConnection(driver);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Cannot connect" + ex);
      Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  ResultSet executeQuery(String sqlStmt) throws SQLException {
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery(sqlStmt);
    return rs;
  }

  void updateTbl(String update) throws SQLException {
    Statement st = conn.createStatement();
    st.executeUpdate(update);
    st.close();
  }

  void addField(String deviceName, Double devicePrice, int numOfPorts, String protocol, String description, String signalBoosting) throws SQLException {
    Statement st = conn.createStatement();
    st.executeUpdate("INSERT INTO tblNetworkDevices ( Device, Price, NumberOfPorts, Description, SignalBoosting, Protocol )\n"
            + "VALUES ('" + deviceName + "'," + devicePrice + ", " + numOfPorts + ", '" + description + "', " + signalBoosting + ", '" + protocol + "')");
    st.close();
  }

  void updateField(String prevName, String deviceName, Double devicePrice, int numOfPorts, String protocol, String description, String signalBoosting) throws SQLException {
    Statement st = conn.createStatement();
    st.executeUpdate("Update tblNetworkDevices SET Device = '" + deviceName + "', Price = " + devicePrice
            + ", NumberOfPorts = " + numOfPorts + ", Description = '" + description + "', SignalBoosting = "
            + signalBoosting + ", Protocol = '" + protocol + "' WHERE Device = '" + prevName + "'");
  }

  public String sortTable(String fieldName) {
    String output = "";
    try {
      // Get results of the SQL statement
      stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM tblNetworkDevices ORDER BY " + fieldName);

      // headings
      output += "Device\tPrice\tPorts\tSignalBoost\tProtocol\n";

      // loop through results
      while (rs.next()) {
        output += rs.getString("Device") + "\t" + rs.getString("Price") + "\t" + rs.getString("NumberOfPorts")
                + "\t" + rs.getString("SignalBoosting") + "\t\t" + rs.getString("Protocol") + "\n";
      }
    } catch (SQLException e) {
      output = "ERROR: " + e;
    }
    return output;
  }

  public String displaySingle(String entryName) {
    String output = "";
    try {
      // Get results of the SQL statement
      stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM tblNetworkDevices WHERE Device LIKE '*" + entryName + "*'");

      // headings
      output += "Device\tPrice\tPorts\tSignalBoost\tProtocol\n";

      // loop through results
      while (rs.next()) {
        output += rs.getString("Device") + "\t" + rs.getString("Price") + "\t" + rs.getString("NumberOfPorts")
                + "\t" + rs.getString("SignalBoosting") + "\t\t" + rs.getString("Protocol") + "\n";
      }
    } catch (SQLException e) {
      output = "ERROR: " + e;
    }
    return output;
  }

  public String displayAll() {
    String output = "";
    try {
      // Get results of the SQL statement
      stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM tblNetworkDevices");

      // headings
      output += "Device\tPrice\tPorts\tSignalBoost\tProtocol\n";

      // loop through results
      while (rs.next()) {
        output += rs.getString("Device") + "\t" + rs.getString("Price") + "\t" + rs.getString("NumberOfPorts")
                + "\t" + rs.getString("SignalBoosting") + "\t\t" + rs.getString("Protocol") + "\n";
      }
    } catch (SQLException e) {
      output = "ERROR: " + e;
    }
    return output;
  }

  public String getSum() {
    String output = "";
    try {
      // Get results of the SQL statement
      stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT SUM(Price) AS Sum FROM tblNetworkDevices");

      while (rs.next()) {
        output += "Sum of All Entries: " + rs.getString(1);
      }

    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "ERROR: " + e);
    }

    return output;
  }

  public String[] getSingleRecord(String entryName) {
    String[] entry = new String[6];
    try {
      // Get results of the SQL statement and outputs them in a String Array
      stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM tblNetworkDevices WHERE Device LIKE '*" + entryName + "*'");
      rs.next();
      entry[0] = rs.getString("Device");
      entry[1] = rs.getString("Price");
      entry[2] = rs.getString("NumberOfPorts");
      entry[3] = rs.getString("Protocol");
      entry[4] = rs.getString("Description");
      entry[5] = rs.getString("SignalBoosting");
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e);
    }
    return entry;
  }
}
