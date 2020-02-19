import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Teacher {
    private String name;
    private Map<Integer, List<Student>> students;

    public Teacher() {
    }

    public Teacher(String name, Map<Integer, List<Student>> students) {
        this.name = name;
        this.students = students;
    }

    public Map<Integer, List<Student>> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (this.students.get(student.getAge()) == null) {
            this.students.put(student.getAge(), new ArrayList<Student>() {{
                add(student);
            }});
        } else {
            this.students.get(student.getAge()).add(student);
        }
    }

}
