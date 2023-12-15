// Принцип подстановки Барбары Лисков
public class Professor extends Teacher{

    public String degree;

    public Professor(int teacherId, String firstName, String secondName, String lastName, String degree) {
        super(teacherId, firstName, secondName, lastName);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return  "Professor{" +
                "teacherId =" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", degree='" + degree + '\'' +
                "}\n";
    }
}
