public class Stepik {
    public static void main(String[] args) {
        int value = 7;
        value = Math.abs(value);
        int pos = Integer.bitCount(value);
        System.out.println(pos);
    }
}
