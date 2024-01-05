public class Hello{
    public void doProcess(int i, Process p){
        p.process(i);
    }
    public static void main(String[] args) {
        Hello thisReferenceExample = new Hello();
        //2. it is likely reffering here.
        thisReferenceExample.doProcess(10, i -> {
            System.out.println("value of i is " + i);
            System.out.println(this);   //1. 'this' keyword is reffer to outside of lambda by design
        });
    }
}

interface Process{
    void process(int i);
}