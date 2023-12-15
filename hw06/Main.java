import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.create("aab", "aab", "aab");
        controller.create("aaa", "aaa", "aaa");
        controller.create("Aaa", "Aaa", "Aaa");
        controller.create("bbb", "bbb", "bbb");
        controller.SendOnConsole();

        System.out.println();

        TeacherController teacherController = new TeacherController();
        teacherController.create("Чингачгук", "Аарон", "Моисеевич");
        teacherController.create("Виниту", "Давид", "Маркович");
        teacherController.create("Джеронимо", "Абрам", "Соломонович");
        teacherController.create("Покахонтас", "Юдифь", "Абдурахмановна");
        teacherController.SendOnConsole();

        Professor professor1 = new Professor(1, "Чингачгук", "Аарон", "Моисеевич","Профессор");
        Professor professor2 = new Professor(2, "Виниту", "Давид", "Маркович","Кандидат наук");
        Professor professor3 = new Professor(3, "Джеронимо", "Абрам", "Соломонович","Кандидат наук");
        Professor professor4 = new Professor(4, "Покахонтас", "Юдифь", "Абдурахмановна","Профессор");
        Professor professor5 = new Professor(5, "Ункас", "Моисей", "Ааронович", "Нет степени");
        ArrayList<Teacher>  prepod = new ArrayList<>();
        prepod.add(professor1);
        prepod.add(professor2);
        prepod.add(professor3);
        prepod.add(professor4);
        prepod.add(professor5);

        // Принцип подстановки Барбары Лисков
        System.out.println("\nПринцип подстановки Барбары Лисков\n" + prepod + '\n') ;


//        Student student1 = new Student(4, "aab", "aab", "aab");
//        Student student2 = new Student(2, "aaa", "aaa", "aaa");
//        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
//        Student student4 = new Student(1, "bbb", "bbb", "bbb");
//        List<Student> studentList = new ArrayList<>();
//        StudentGroup studentGroup = new StudentGroup(studentList);
//        studentGroup.addStudent(student1);
//        studentGroup.addStudent(student2);
//        studentGroup.addStudent(student3);
//        studentGroup.addStudent(student4);
//        StudentGroupService service = new StudentGroupService(studentGroup);
//        for (Student student : studentGroup) {
//            System.out.println(student);
//        }
//        System.out.println();
//        for (Student student : service.getSortedStudentGroup()) {
//            System.out.println(student);
//        }
//        System.out.println();
//        for (Student student : service.getSortedStudentGroupByFIO()) {
//            System.out.println(student);
//        }
//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//        System.out.println();
//        for(Student student : studentGroup){
//            System.out.println(student);
    }
}
