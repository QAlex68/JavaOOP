import java.util.ArrayList;
import java.util.List;

public class Stream implements Comparable<Stream>{

    private int streamId;
    private List<Group> groups;

    public Stream(int streamId) {
        this.streamId = streamId;
        this.groups = new ArrayList<Group>();
    }

    public int getStreamId() {
        return streamId;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setStreamId(int streamId) {
        this.streamId = streamId;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "streamId=" + streamId + '\n' +
                ",groups  ='" + groups +
                "}\n";
    }

    // Метод сравнения по Id потока
    @Override
    public int compareTo(Stream s) {
        if(this.getStreamId() > s.getStreamId())
            return 1;
        if(this.getStreamId() < s.getStreamId())
            return -1;
        return 0;
    }


    public void addGroup(Group group) {
        this.groups.add(group);
    }
}
