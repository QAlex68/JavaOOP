import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group("Группа 1");
        Group group2 = new Group("Группа 2");
        Group group3 = new Group("Группа 3");
        Group group4 = new Group("Группа 4");
        Group group5 = new Group("Группа 5");
        Group group6 = new Group("Группа 6");
        Group group7 = new Group("Группа 7");

        Stream stream1 = new Stream(1);
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream(2);
        stream2.addGroup(group3);
        stream2.addGroup(group1);
        stream2.addGroup(group4);
        stream2.addGroup(group6);
        stream2.addGroup(group7);

        Stream stream3 = new Stream(3);
        stream3.addGroup(group5);

        Stream stream4 = new Stream(4);
        stream4.addGroup(group3);
        stream4.addGroup(group1);
        stream4.addGroup(group7);

        Stream stream5 = new Stream(5);
        stream5.addGroup(group3);
        stream5.addGroup(group5);
        stream5.addGroup(group4);
        stream5.addGroup(group2);

        // Создаем список потоков
        List<Stream> streams = List.of(stream4, stream3, stream5, stream1, stream2);
        StreamService sorter = new StreamService();

        System.out.println("Список потоков для наглядности");
        System.out.println(streams);

        // сортировка потоков по id
        List<Stream> streams2;
        streams2 = sorter.sortStreamsById(streams);
        System.out.println("Сортировка потоков по Id");
        System.out.println(streams2);

        // сортировка потоков по количеству групп
        List<Stream> streams3;
        streams3 = sorter.sortStreamsByGroupSize(streams);
        System.out.println("Сортировка потоков по количеству групп");
        System.out.println(streams3);
    }
}
