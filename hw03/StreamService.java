import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {

    // Метод сортировки по Id
        public List<Stream> sortStreamsById(List<Stream> streams) {
        List<Stream> streamList = new ArrayList<>(streams);
        Collections.sort(streamList);
        return streamList;
    }
    // Метод сортировки по количеству групп в потоке  с использованием компаратора
    public List<Stream> sortStreamsByGroupSize(List<Stream> streams) {
        List<Stream> streamList = new ArrayList<>(streams);
        Collections.sort(streamList, new StreamComparator());
        return streamList;
    }
}
