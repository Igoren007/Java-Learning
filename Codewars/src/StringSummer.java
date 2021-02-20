public class StringSummer {
    public static void main(String[] args) {
        System.out.println(summy("0 0"));
    }

    static long summy(String stringOfInts) {
        long sum = 0;
        String[] numbers = stringOfInts.split(" ");
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
