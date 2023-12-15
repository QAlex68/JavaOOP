public class StudentController implements UserController<Student> {

    private final StudentService studentService = new StudentService();
    private final StudentVew studentVew = new StudentVew();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName, secondName, lastName);

    }

    @Override
    public void SendOnConsole() {
        studentVew.sendOnConsole(studentService.getStudentList());

    }

}
