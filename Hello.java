class Hello{
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("printed inside anonymous innerclass");
            }            
        });

        myThread.run();

        Thread myLamdaThread = new Thread(() -> System.out.println("printed inside lambda"));
        myLamdaThread.run();        
    }
}