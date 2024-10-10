public class intro{
    public static void main(String[] args){
        Pen p1=new Pen();
        p1.setColor("Blue");
        System.out.println("Pen color: " + p1.getColor());
        p1.setTip(5);
        System.out.println("Tip Size: " + p1.gettipSize());

        // BankAccount myAcc=new BankAccount();
        // myAcc.username="KumarMintu";
        // System.out.println("userName: " +  myAcc.username);
        // myAcc.setPassword("abcdefgh");
        // System.out.println(myAcc.setPassword());
    }
}
class Pen{
    private String color;
    private int tipSize;

    String getColor(){
        return this.color;
    }
    int gettipSize(){
        return this.tipSize;
    }

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tipSize=newTip;
    }
}
// class BankAccount{
//     public String username;
//     private String password;

//     void setPassword(String pwd){
//         password=pwd;
//     }
// }