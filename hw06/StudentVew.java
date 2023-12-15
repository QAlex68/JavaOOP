import java.util.List;

public class StudentVew implements UserVew<Student> {

    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student i : list)
            System.out.println(i);
    }
}
