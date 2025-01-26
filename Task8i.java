/*Q9. Check if a string Matches a pattern : Use matches() to verify if a string
 a matches a Specific regular expression? */

public class Task8i {
    public static void main(String[] args) {
        String name = "Java is a hot cup of tea";
       
        //true
        System.out.println(name.matches("Java is a hot cup of tea"));
        
        //false
        System.out.println(name.matches("Java is a"));
    }
}
