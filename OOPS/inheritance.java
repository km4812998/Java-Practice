public class inheritance {
    public static void main(String[] args) {
        //SINGLE LEVEL
        // Fish shark=new Fish();
        // shark.eat();
        // shark.swim();

        //MULTI-LEVEL
        // Dogs Tom=new Dogs();
        // Tom.eat();
        // Tom.legs=4;
        // System.out.println(Tom.legs);
        // Tom.breed="Jerman Spherd";
        // System.out.println(Tom.breed);

        //HIERARCHICAL INHERITANCE
        Mammals humans =new Mammals();
        humans.walk();
        humans.legs=2;
        System.out.println(humans.legs);
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

//SINGLE LEVEL INHERITANCE

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}

// MULTI-LEVEEL INHERITANCE
//HEIRARCHICAL INHERITANCE
class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }
}
//derived from another derived class 
class Dogs extends Mammals{
    String breed;
}


//HEIRARCHICAL INHERITANCE

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}