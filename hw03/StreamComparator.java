import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    // Метод сравнения по количеству групп
    @Override
    public int compare(Stream o1, Stream o2) {
        if(o1.getGroups().size() > o2.getGroups().size())
            return 1;
        if(o1.getGroups().size() < o2.getGroups().size())
            return -1;
        return 0;
    }
}
