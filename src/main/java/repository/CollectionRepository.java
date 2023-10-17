
package repository;

import java.util.ArrayList;
import model.Student;
import dataacess.CollectionDAO;


public class CollectionRepository implements ICollectionRepository{

    @Override
    public void display(ArrayList<Student> lt) {
       CollectionDAO.Instance().display(lt);
    }
    
}
