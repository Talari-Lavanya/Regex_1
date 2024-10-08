import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg1{
// Prepare a Regex for Email Validation
public static void main(String[] args){
    emailvalidation("example@gmail.com");
    emailvalidation("invalid-email.com");
}
public static void emailvalidation(String email){
    System.out.println("Email Validation");
    String pattern = "^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(email);
    if(m.matches()){
        System.out.println("Valid email: " +email);
    }else {
        System.out.println("Invalid email: " + email);
    }
    System.out.println();
}
}
