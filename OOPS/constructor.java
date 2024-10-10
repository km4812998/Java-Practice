public class constructor {
    public static void main(String args[]){
        Student s1=new Student("Mintu Kumar");
        System.out.println(s1.name);
    }
}

class Student{
    String name;

    Student(String name){
        System.out.println("Constructor called..");
        this.name=name;
    }
}
