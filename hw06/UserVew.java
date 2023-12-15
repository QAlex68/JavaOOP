import java.util.List;

public interface UserVew <T extends User>{

    void sendOnConsole(List<T> list);
}
