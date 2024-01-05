class Hello{
    public static void main(String[] args) {
        printLambda(s -> s.length());        
    }

    public static void printLambda(StringLength sl){
        System.out.println(sl.getLength("Hello Lambda"));
    }

    public interface StringLength {
        int getLength(String str);
    }
}