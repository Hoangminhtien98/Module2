package AccesModifier.BaiTap.Student;

public class Student {
    private String name = "Minh Tien";
    private String classes = "C1021H1";

    public Student() {
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
