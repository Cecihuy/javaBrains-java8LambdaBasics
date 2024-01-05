class Hello{
    public static void main(String[] args) {
        StringLength myLamb = s -> s.length();

        System.out.println(myLamb.getLength("Hello lambda"));
    }

    public interface StringLength {
        int getLength(String str);
    }
}