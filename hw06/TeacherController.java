
public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService = new TeacherService();
    private final TeacherVew teacherVew = new TeacherVew();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);

    }

    @Override
    public void SendOnConsole() {
        teacherVew.sendOnConsole(teacherService.getTeacherList());

    }

}