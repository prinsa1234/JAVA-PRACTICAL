
import java.lang.String;
public class practical25 {
    public static void UserException() throws NullPointerException {
        String name = null;
        System.out.println("Length of the string: " + name.length());
    }
    public static void main(String[] args) {
        try {
            UserException();
        } catch (NullPointerException e) {
            System.out.println("Exception is solved with:" + e);
 }
}
}
