import java.util.function.BiConsumer;

class Hello{
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

        process(someNumbers, key, (k, v) -> {
            try{
                System.out.println(k / v);
            } catch(ArithmeticException e){
                System.out.println("an arithmetic exception happened");
            }
        });
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer> biConsumer) {
        for(int efl:someNumbers){
            try{
                biConsumer.accept(efl, key);
            } catch(ArithmeticException e){

            }
        }
    }    
}