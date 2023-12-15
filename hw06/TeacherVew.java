import java.util.List;

public class TeacherVew implements UserVew<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher i : list)
            System.out.println(i);
    }

}