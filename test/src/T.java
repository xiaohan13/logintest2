import java.util.*;
import org.jose4j.base64url.Base64;



public class T {
    public static void main(String[] args){
        System.out.println("Hello World");
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        c.add(Calendar.MINUTE, 5);
        System.out.println(c.getTime());
        byte[] a = Base64.decode(lx2ddOljIMQZt23mW0YwnKKeX7tHmABC5h07J5batwg=);
        System.out.println(a);
    }
}
