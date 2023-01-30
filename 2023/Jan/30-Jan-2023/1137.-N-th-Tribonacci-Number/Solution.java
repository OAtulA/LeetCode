public class Solution {
    public static int tribonacci (int n) {
        int a=0, b=1,c=1,temp;
        if(n ==0)
            return 0;
        else if(n<=2)
            return 1;
        else{

        for (int i = 3; i <= n; i++) {
            temp = a+b+c;
            a =b;
            b=c;
            c= temp;
        }
        return c;
        }
        
    }

    public static void main(String[] args) {
        int n =25;
        int ans= tribonacci(n);
        System.out.println(ans);
    }
}
