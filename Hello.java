import java.util.function.BiConsumer;

class Hello{
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

        process(someNumbers, key, wrapperLambda((k, v) -> System.out.println(k / v)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer> biConsumer) {
        for(int efl:someNumbers){
            biConsumer.accept(efl, key);           
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer,Integer> biConsumer){
        return (a, b) -> {
            try{
                biConsumer.accept(a, b);
            } catch(ArithmeticException e){
                System.out.println("exception in wrapper lambda");
            }
        };
    }
}