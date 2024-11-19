package BuisnessLayer;

import DataLayer.Student;
import java.util.List;

public interface Filter {
   
    List<Student> process(List<Student> students);
}
