package algorithm.easy;

/**
 * @author dongshan
 * @create 2019-12-04 10:45
 */
public class reverseInt {
    public static int reverseInt1(int x) {
        int re = 0;
        while(x!=0){
            int pop = x % 10;
            x/=10;
            if (re > Integer.MAX_VALUE/10 || (re == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (re < Integer.MIN_VALUE/10 || (re == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            re = re*10+pop;

        }
        return re;
    }
}
