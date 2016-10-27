import  jelementary.School;
import  jelementary.Group;
import  jelementary.people.Student;

public class Main {
    public static void main(String ... args) {
        Student student1 = new Student("John Doe", 24, 1);
        Student student2 = new Student("Jane Roe", 20, 1);
        Student student3 = new Student("John Smith", 34, 1);

        Group jelementary = new Group("JElementary", 1);
        Group english = new Group("English Classes", 2);
        Group automation = new Group("Automation testing", 3);

        School hillel = new School("IT School Hillel", "Kanatnaya str, 22"); 

        hillel.addGroup(jelementary);
        hillel.addGroup(english);

        jelementary.addStudent(student1);
        jelementary.addStudent(student2);

        english.addStudent(student1);
        english.addStudent(student2);
        english.addStudent(student3);

        automation.addStudent(student3);

        System.out.println(hillel);
    }
}
