package service;

import model.*;

import java.util.ArrayList;
import java.util.List;


public class DataService {

    private List<User> userList;
    private List<Group> groupList;
    // ((Teacher) userList get.(1)).


    public DataService() {
        this.userList = new ArrayList<>();
        this.groupList = new ArrayList<>();
    }

    public void create(String firstName, String secondName, String lastName, Type type) {
        // Type.STUDENT == type;
        int id = getMaxId(type);
        if (type == Type.STUDENT)
            userList.add(new Student(firstName, secondName, lastName, id));
        if (type == Type.TEACHER)
            userList.add(new Teacher(firstName, secondName, lastName, id));
    }


    private int getMaxId(Type type) {
        boolean itsStudent = type == Type.STUDENT;
        int maxId = 1;
        for (User user : userList) {
            if (user instanceof Student && itsStudent) {
                maxId = ((Student) user).getStudentId() + 1;
            }
            if (user instanceof Teacher && !itsStudent) {
                maxId = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return maxId;
    }

    public List<User> getConcUser(Type type) {
        List<User> resultList = new ArrayList<>();
        boolean itsStudent = type == Type.STUDENT;
        for (User user : userList) {
            if (user instanceof Student && itsStudent) {
                resultList.add(user);
            }
            if (user instanceof Teacher && !itsStudent) {
                resultList.add(user);
            }
        }
        return resultList;
    }

    public void createGroup(int teacherId, List<Integer> studentIds) {
        int id = getMaxIdGroup();
        groupList.add(new Group(id, teacherId, studentIds));

    }

    private int getMaxIdGroup() {
        int maxId = 1;
        for (Group group : groupList) {
            if (group.getGroupId() >= maxId) {
                maxId = group.getGroupId() + 1;
            }
        }
        return maxId;
    }

    public List<Group> getConcGroup() {
        List<Group> resultList = groupList;
        return resultList;
    }

    public User getUserById(int id, Type type) {
        for (User user : getConcUser(type)) {
            if (type == Type.STUDENT && id == ((Student) user).getStudentId()) {
                return user;
            }
            if (type == Type.TEACHER && id == ((Teacher) user).getTeacherId()) {
                return user;
            }

        }
        return null;
    }

    public List<Group> getGroupList() {
        return groupList;
    }
}
