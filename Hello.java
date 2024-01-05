public class Hello{
    public void doProcess(int i, Process p){
        p.process(i);
    }
    public static void main(String[] args) {
        Hello thisReferenceExample = new Hello();
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i){
                System.out.println("value of i is " + i);
                System.out.println(this);   //'this' keyword is reffer to new Process
            }
            @Override
            public String toString(){
                return "This is the anonymous inner class";
            }
        });
    }
}

interface Process{
    void process(int i);
}