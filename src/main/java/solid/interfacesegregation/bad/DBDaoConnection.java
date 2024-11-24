package solid.interfacesegregation.bad;

/*
    It breaks the Interface segregation Principle as the DBDaoConnection is forced to implement the method openFile
    and closeFile which it doesn't support.
 */
public class DBDaoConnection implements DAOInterface{
    @Override
    public void openConnection() {
        // Connection Logic
    }

    @Override
    public void createRecord() {
        // Create Record Logic
    }

    @Override
    public void openFile() {
        // We are in DB connection so no need to support open File
        throw new UnsupportedOperationException("Open File not supported.");
    }

    @Override
    public void deleteRecord() {
        // Delete Record Logic
    }

    @Override
    public void closeFile() {
        throw new UnsupportedOperationException("Close File not supported in DB connection.");
    }

    @Override
    public void closeConnection() {
        // Close DB connection Logic
    }
}
