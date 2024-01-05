class Hello{
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        Hello greeter = new Hello();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        Greeting myLambdaFunction = () -> System.out.println("Hello world!");
    }    
}