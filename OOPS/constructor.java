public class constructor {
    public static void main(String args[]){
        Student s1=new Student();
        System.out.println(s1.name);
        Student s2= new Student("Mintu Kumar");
        System.out.println(s2.name);
        Student s3=new Student(123);
        System.out.println(s3.roll);
    }
}

class Student{
    String name;
    int roll;

    Student(String name){
        System.out.println("Constructor called..");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}
