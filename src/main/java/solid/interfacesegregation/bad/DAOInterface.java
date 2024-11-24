package solid.interfacesegregation.bad;

/*
    This DAO (Data Access Object) interface is defined to support data access using file system or database system.
    So we have added methods to support both.

    This is bad because we have to Accommodate all operation in a single interface.
    It breaks the Interface Segregation principle.

    =====
    Interface Segregation Principle
    It states that
        A client should never be forced to implement an interface that it does not use,
        or clients shouldn’t be forced to depend on methods they do not use.
 */

public interface DAOInterface {
    public void openConnection();
    public void closeConnection();
    public void createRecord();
    public void openFile();
    public void closeFile();
    public void deleteRecord();
}
