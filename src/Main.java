import java.math.BigInteger;

public class Main {

    public static int sqr(int value, int powValue) {
//        return value * value; // 1 способ
//        return (int) Math.pow(value, powValue); // 2 способ
//        if (powValue == 1) { // 3 способ
//            return value;
//        } else {
//            return value * sqr(value,powValue - 1);
//        }
        BigInteger a = new BigInteger(String.valueOf(value));
        return a.pow(powValue).intValue(); // 4 способ
    }
    public static void main(String[] args) {
        System.out.println(sqr(2, 2));
    }
}