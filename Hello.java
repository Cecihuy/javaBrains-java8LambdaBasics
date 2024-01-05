/*
 * step to write lambdas
 */
class Hello{
    public static void main(String[] args) {        
    }
    
    /* original code */
    aBlockOfCode =  public void perform(){
                        System.out.println("Hello World!");
                    }
    /* if function exist in isolation, doesn't make sense 
     * to call it public. get rid of it!!!
     */
    aBlockOfCode =  void perform(){
                        System.out.println("Hello World!");
                    }
    /*
     * the way refering to this function is using variable name.
     * it doesn't need method name. get rid of it!!!
     */
    aBlockOfCode =  void (){
                        System.out.println("Hello World!");
                    }
    /*
     * compiler will know what the return type is
     * base on expression it self. get rid of it!!!
     */
    aBlockOfCode =  (){
                        System.out.println("Hello World!");
                    }
    /*
     * make it lambda expression by puting arrow symbol ->
     * between () round bracket and {} curly bracket
     */
    aBlockOfCode =  () -> {
                        System.out.println("Hello World!");
                    }
    /*
     * here inside block code {} contains only one statement
     * we can remove {} curly bracket. get rid of it!!!
     */
    aBlockOfCode =  () -> System.out.println("Hello World!");                    
}