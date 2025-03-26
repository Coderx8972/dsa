import java.util.HashMap;
import java.util.Map;
public class HInfy1Bruteforce {
    public static void main(String[] args) {
        int num=1;
        sol(num);
    }
    static void sol(int num){
        Map<Integer,Integer> res = new HashMap<>();
        while(num>0){
            
        }
    }
    static int beautify(int n){
        int i=n+1;
        while(i>0){
            if(i%10==0) i=i/10;
            else break;
        }
        return i;
    }

}
