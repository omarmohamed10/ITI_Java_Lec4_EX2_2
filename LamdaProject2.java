package lamdaproject2;
import java.util.function.Predicate;
/**
 *
 * @author omar
 */
// NAME: Omar Mohamed Abd El-Hamid
// Group: G_10
public class LamdaProject2 {

    public static void main(String[] args) {
        
        
        Predicate<String> p = (s)->{
       
       char[]ch = s.toCharArray();
        for(int i = 0 ;i<ch.length;i++){
            if(!Character.isLetter(ch[i]))return false;
        }
        return true;
       
       };
       System.out.println(p.test("omar"));
       System.out.println(p.test("omar22"));
       
    }
    
}
