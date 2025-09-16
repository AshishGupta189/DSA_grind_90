import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        
        System.out.println(subset("","abc"));
    }

    static List<String> subset(String s,String str){
        if(str.isEmpty()){
            List<String> ls = new ArrayList<>();
            ls.add(s);
            return ls;
        }
        char ch = str.charAt(0);
        List<String> left=subset(s+ch, str.substring(1) );
        List<String> right=subset(s, str.substring(1));
        left.addAll(right);
        return left;
    }
    
}
