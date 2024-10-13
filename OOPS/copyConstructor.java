public class copyConstructor {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Mintu Kumar";
        s1.roll=107;
        s1.password="aabcdd";

        Student s2=new Student(s1);
        s2.password="defg";
    }
}

class Student{
    String name;
    int roll;
    String password;

    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }
    Student(){
        System.out.println("Constructor called..");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}
