
package controller;
import java.util.ArrayList;
import model.Student;
import repository.CollectionRepository;

public class Program {
    
    CollectionRepository program;
    ArrayList<Student> lt;
    
    public Program() {
        program = new CollectionRepository();
        lt = new ArrayList<>();
    }
    
    public void run() {
        System.out.println("====== Collection Sort Program ======");
        program.display(lt);
    }
}
