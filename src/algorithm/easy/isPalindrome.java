package algorithm.easy;

/**
 * @author dongshan
 * @create 2019-12-04 10:51
 */
public class isPalindrome {
    //各位上的数字
    //int i = 12345
    //int ge = i%10  int shi = (i/10)%10  依次类推
    //暴力字符串
    //缺点 需要创建额外空间
    public static boolean isPalindrome(int x) {
        String reversedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(reversedStr);
    }
    //数学解法
    public static boolean isPalindrome1(int x) {
        //边界判断
        if (x < 0) return false;
        //记录获取最高位的被除数
        int div = 1;
        while (x / div >= 10) div *= 10;
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
    //最优解法（未理解透彻）
    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
