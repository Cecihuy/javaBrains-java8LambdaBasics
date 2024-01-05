public class Hello{    
    public static void main(String[] args) {
        //lambda version
        Thread lmbd = new Thread(() -> printMessage());
        lmbd.start();
        
        //method reference version
        Thread mRef = new Thread(Hello::printMessage);  //static
        mRef.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}