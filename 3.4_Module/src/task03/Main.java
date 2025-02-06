package task03;
import java.io.*;

// OPISKELIJA
class Student implements Serializable {
    private static int idCount = 0;
    private final String name;
    private final int id;
    private int age;

    public Student(String name, int age) {
        this.id = ++idCount;
        this.name = name;
        this.age = age;
    }

    public int getId() {return id;}

    public String getName() {return name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}
}

// KURSSI
class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() {return courseCode;}

    public void setCourseCode(String courseCode) {this.courseCode = courseCode;}

    public String getCourseName() {return courseName;}
    
    public void setCourseName(String courseName) {this.courseName = courseName;}

    public String getInstructor() {return instructor;}

    public void setInstructor(String instructor) {this.instructor = instructor;}
}

// ILMOITTAUTUMINEN
class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {return student;}

    public void setStudent(Student student) {this.student = student;}

    public Course getCourse() {return course;}

    public void setCourse(Course course) {this.course = course;}

    public String getEnrollmentDate() {return enrollmentDate;}

    public void setEnrollmentDate(String enrollmentDate) {this.enrollmentDate = enrollmentDate;}
}

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Student opiskelija = new Student("Onni K.", 76);
            Course kurssi = new Course("TX00Blää-blää", "Java101", "Jarkko V.");
            Enrollment ilmoittautuminen = new Enrollment(opiskelija, kurssi, "01.01.2025");

            //serialisoidaan
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\onnik\\Ohjelmointi\\olio-ohjelmointi\\3.4_Module\\src\\task03\\enrollments.ser");
            ObjectOutputStream out = new ObjectOutputStream(outputStream);
            out.writeObject(ilmoittautuminen);
            out.close();
            outputStream.close();

            //epäserialisoidaan
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\onnik\\Ohjelmointi\\olio-ohjelmointi\\3.4_Module\\src\\task03\\enrollments.ser");
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            Enrollment deIlmoittautuminen = (Enrollment) in.readObject();

            in.close();
            fileInputStream.close();

            // printtaillaan
            System.out.println("Deserialized Ilmoittautuminen:");
            System.out.println(deIlmoittautuminen.getStudent().getId());
            System.out.println(deIlmoittautuminen.getStudent().getName());
            System.out.println("Ikä: " + deIlmoittautuminen.getStudent().getAge());
            System.out.println("Kurssikoodi: " + deIlmoittautuminen.getCourse().getCourseCode());
            System.out.println("Kurssi: " + deIlmoittautuminen.getCourse().getCourseName());
            System.out.println("Opettaja: " + deIlmoittautuminen.getCourse().getInstructor());
            System.out.println("Ilmoittautumis PVM: " + deIlmoittautuminen.getEnrollmentDate());

        } catch (IOException e) {
        }
    }
}