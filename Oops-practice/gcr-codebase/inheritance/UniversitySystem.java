
class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString(){
        return "Name:" + name + ", Age: " + age;


    }
}
class Student extends Person{
    final String studentID;
    double GPA;

    public Student(String name, int age, String studentID, double GPA){
        super(name, age);
        this.studentID = studentID;
        this.GPA = GPA;
    }
    @Override
    public String toString(){
        return super.toString() + ", StduentID:" + studentID + ", GPA: " + GPA;
    }
}
class GradStudent extends Student{
    String thesis;

    public GradStudent(String name, int age, String studentID, double GPA, String thesis){
        super(name, age, studentID, GPA);
        this.thesis = thesis;
    }
    @Override
    public String toString(){
        return super.toString() + ", Thesis: " + thesis;
    }
}


public class UniversitySystem {
    public static void main(String[] args){

    
    GradStudent gs = new GradStudent("tanishqa", 22, "2315002287", 6.7, "Machine Learning in Healthcare");

    System.out.println(gs);

    System.out.println();

    System.out.println(
                "GradStudent IS-A Student: "
                        + (gs instanceof Student));

        System.out.println(
                "Student IS-A Person: "
                        + (gs instanceof Person));
        }


    
}
