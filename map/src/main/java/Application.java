import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Student Linda = new Student("Linda", 18);
        Student Cindy = new Student("Cindy", 19);
        Student Mary = new Student("Mary", 19);
        Teacher teacher = new Teacher("Bob", new LinkedHashMap<Integer, List<Student>>() {{
            put(Linda.getAge(), new ArrayList<Student>() {{
                add(Linda);
            }});
            put(Cindy.getAge(), new ArrayList<Student>() {{
                add(Cindy);
                add(Mary);
            }});
        }});
        teacher.addStudent(new Student("Ben", 19));
        teacher.addStudent(new Student("Solider", 20));
        System.out.println(teacher.getStudents());
    }
}

