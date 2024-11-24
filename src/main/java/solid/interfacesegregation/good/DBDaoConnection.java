package solid.interfacesegregation.good;

/*
    Implemented Relevant Interfaces, By segregating Interfaces into DAOInterface and DBInterface
    the client DBDaoConnection isn't forced to implement methods which aren't relevant to it.
 */
public class DBDaoConnection implements DAOInterface, DBInterface {
    @Override
    public void openConnection() {

    }

    @Override
    public void closeConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }
}
