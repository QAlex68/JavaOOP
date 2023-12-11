package controller;

import model.*;
import service.DataService;
import view.GroupView;
import view.StudentView;
import view.TeacherView;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final GroupView groupView = new GroupView();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent() {
        for (User user : dataService.getConcUser(Type.STUDENT)) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void getAllTeacher() {
        for (User user : dataService.getConcUser(Type.TEACHER)) {
            teacherView.printOnConsole((Teacher) user);
        }
    }

    public void createGroups(int teacherId, List<Integer> studentIds) {
        dataService.createGroup(teacherId, studentIds);
    }

    public void getAllGroups() {
        for (Group group : dataService.getConcGroup()) {
            groupView.printOnGroups(group);
        }
    }

    // Дополнительный метод вывода списка учебных групп на консоль
    public String toString2() {
        StringBuilder result = new StringBuilder();
        for (Group group : dataService.getGroupList()) {
            Teacher teacher = (Teacher) dataService.getUserById(group.getTeacherId(), Type.TEACHER);
            result.append("\nGroup{" + "groupId=")
                    .append(group.getGroupId())
                    .append("\nteacherId=")
                    .append(teacher.getTeacherId())
                    .append(", firstName= ")
                    .append(teacher.getFirstName())
                    .append(", secondName= ")
                    .append(teacher.getSecondName())
                    .append(", lastName= ")
                    .append(teacher.getLastName())
                    .append("\n Список Студентов..");

            List<Integer> studentsList = group.getStudentIds();
            for (int id : studentsList) {
                Student student = (Student) dataService.getUserById(id, Type.STUDENT);
                result.append("\nstudentId=")
                        .append(student.getStudentId())
                        .append(", firstName= ")
                        .append(student.getFirstName())
                        .append(", secondName= ")
                        .append(student.getSecondName())
                        .append(", lastName= ")
                        .append(student.getLastName());
            }
        }
        return result.toString();
    }
}
