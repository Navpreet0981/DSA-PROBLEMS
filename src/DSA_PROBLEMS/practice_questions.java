package DSA_PROBLEMS;

public class practice_questions {

    public static void main(String[] args) {

        Student s = new Student();
        s.print();
        Student s2 = new Student2();
        s.print();
        
    }
}
class Student{
    String name;
    int marks;
    void print(){
        System.out.println("In student(Base) class..");
    }    
}
class Student2 extends Student{
    void print(){
        System.out.println("In Student2(Derived) class..");
    }
}
