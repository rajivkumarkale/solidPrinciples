package solid.interfacesegregation.good;

/*
    Implemented Relevant Interfaces, By segregating Interfaces into DAOInterface and FileInterface
    the client FileDaoConnection isn't forced to implement methods which aren't relevant to it.
 */
public class FileDaoConnection implements DAOInterface, FileInterface {
    @Override
    public void closeFile() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void createRecord() {

    }
}
