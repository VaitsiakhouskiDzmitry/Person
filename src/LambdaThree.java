import java.beans.Expression;

public class LambdaThree {
    interface Expression{
        boolean isEqual(int n );
    }
    private  static void m1(){
        Expression func = (n)->n%2==0;
        int[]nums = {1,2,3,4,5,6,7,8,9,};
        System.out.println(sum(nums,func));
    }
    private static int sum(int[]numbers,Expression func){
        int result=0;
        for(int i:numbers){
            if(func.isEqual(i)){
                result+=i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        m1();
    }
}
