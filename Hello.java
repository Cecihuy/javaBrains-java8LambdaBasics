public class Hello{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //if you create lambda, no way to assign b=40. it is called closure
        doProcess(a, new Process() {    
            @Override
            public void process(int i) {
                //b=40;
                System.out.println(i + b);  //in this case, 'b' is final
            }            
        });
    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }

    interface Process{
        void process(int i);
    }
}