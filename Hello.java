class Hello{
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        Hello greeter = new Hello();

        Greeting innerClassGreeting = new Greeting() {
            public void perform(){
                System.out.println("Hello world!");
            }
        };

        Greeting myLambdaFunction = () -> System.out.println("Hello world!");
        
        greeter.greet(innerClassGreeting);
        greeter.greet(myLambdaFunction);
    }    
}