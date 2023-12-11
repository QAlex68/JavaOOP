package model;

import java.util.List;

public class Group {

    private int groupId;
    private int teacherId;
    private List<Integer> studentIds;

    public Group(int groupId, int teacherId, List<Integer> studentIds) {
        this.groupId = groupId;
        this.teacherId = teacherId;
        this.studentIds = studentIds;
    }

    public int getGroupId() {
        return groupId;
    }


    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public List<Integer> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(List<Integer> studentIds) {
        this.studentIds = studentIds;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", teacherId=" + teacherId +
                ", studentIds=" + studentIds +
                '}';
    }

}
