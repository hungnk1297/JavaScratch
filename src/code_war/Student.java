package code_war;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    private String name;

    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        var a = new Student("John", 25);
        var b = new Student("Johny", 26);
        var c = new Student("Anna", 24);
        var d = new Student("Ben", 28);
        var e = new Student("Ben", 27);

        var studentList = new ArrayList<Student>();
        studentList.add(a);
        studentList.add(b);
        studentList.add(c);
        studentList.add(d);
        studentList.add(e);

//        Comparator<Student> studentComparator = Comparator
//                .comparing(Student::getName)
//                        .thenComparing(Student::getAge);
//
//        studentList.sort(studentComparator);

        var listFiltered = studentList.stream()
                        .filter(s -> s.getName().startsWith("J"))
                                .sorted(Comparator.comparing(Student::getAge))
                                .collect(Collectors.toList());

        System.out.println(listFiltered);
    }
}
