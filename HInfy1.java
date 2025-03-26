public class HInfy1 {
    public static void main(String[] args) {
        int num = 1;
        int ans = sol(num);
        System.out.print("Ans :"+ans);
    }
    static int sol(int n){
        int sum=0;
        int t=10;
        while(n>0){
            int rem = n%10;
            sum= sum+(t-(rem+1));
            n=n/10;
        }
        return sum+1;
    }
}
