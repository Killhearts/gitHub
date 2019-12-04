package algorithm.easy;

/**
 * @author dongshan
 * @create 2019-12-04 10:45
 */
public class reverseInt {
    public static int reverseInt(int x) {
        int re = 0;
        while(x!=0){
            re = re*10+x%10;
            x/=10;
        }
        return (re>Integer.MAX_VALUE || re<Integer.MIN_VALUE) ? 0 :re;
    }
}
