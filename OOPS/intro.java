public class intro{
    public static void main(String[] args){
        Pen p1=new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc=new BankAccount();
        myAcc.username="KumarMintu";
        System.out.println(myAcc.username);
        myAcc.setPassword("abcdefgh");
        // System.out.println(myAcc.setPassword());
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class BankAccount{
    public String username;
    private String password;

    void setPassword(String pwd){
        password=pwd;
    }
}