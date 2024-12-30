import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание учебных групп
        StudentGroup group1 = new StudentGroup();
        StudentGroup group2 = new StudentGroup();
        StudentGroup group3 = new StudentGroup();

        // Создание потоков
        Stream stream1 = new Stream();
        stream1.addStudentGroup(group1);
        stream1.addStudentGroup(group2);

        Stream stream2 = new Stream();
        stream2.addStudentGroup(group3);

        Stream stream3 = new Stream();
        stream3.addStudentGroup(group1);
        stream3.addStudentGroup(group2);
        stream3.addStudentGroup(group3);

        // Создание списка потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        // Создание контроллера и сортировка потоков
        Controller controller = new Controller();
        System.out.println("До сортировки:");
        for (Stream stream : streams) {
            System.out.println("Количество групп в потоке: " + stream.getGroupCount());
        }

        // Сортировка потоков
        controller.sortStreams(streams);

        System.out.println("\nПосле сортировки:");
        for (Stream stream : streams) {
            System.out.println("Количество групп в потоке: " + stream.getGroupCount());
        }
    }
}
