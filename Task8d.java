//Check if a string starts or end with a specific value: use StartWith() and endWith methods? 

public class Task8d {
    public static void main(String[] args) {
        String name ="java is a hot cup of tea";

        System.out.println(name.startsWith("java", 0));
        // System.out.println(name.startsWith("is", 7));
        System.out.println(name.endsWith("tea"));
    }
}
