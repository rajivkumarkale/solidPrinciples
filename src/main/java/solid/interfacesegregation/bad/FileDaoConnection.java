package solid.interfacesegregation.bad;

/*
    It breaks the Interface segregation Principle as the FileDaoConnection is forced to implement the method
    openConnection and closeConnection which it doesn't support.
 */
public class FileDaoConnection implements DAOInterface{
    @Override
    public void openConnection() {
        // We can't open connection in file system
        throw new UnsupportedOperationException("Open Connection not supported on FileDaoConnection");
    }

    @Override
    public void createRecord() {
        // Create Record Logic
    }

    @Override
    public void openFile() {
        // Open File logic
    }

    @Override
    public void deleteRecord() {
        // Delete Record Logic
    }

    @Override
    public void closeFile() {
        // Closing File Logic
    }

    @Override
    public void closeConnection() {
        throw new UnsupportedOperationException("Close Connection not supported on FileDaoConnection");
    }
}
