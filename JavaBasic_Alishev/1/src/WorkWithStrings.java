public class WorkWithStrings {
    public static void main(String[] args) {
        String testString = "Котёнок";
        char myChar = testString.charAt(2);
        System.out.println(myChar);

        int myCharAt = testString.codePointAt(2);
        System.out.println(myCharAt);

        String[] poem = { "Мы", "везём", "с", "собой", "кота" };

        for (int j = 0; j < poem.length; j++) {
            for (int i = j + 1; i < poem.length; i++) {
                if (poem[i].compareTo(poem[j]) < 0) {
                    String temp = poem[j];
                    poem[j] = poem[i];
                    poem[i] = temp;
                }
            }
            System.out.println(poem[j]);
        }

        char[] textArray = {'I', ' ', 'l', 'o', 'v', 'e', ' ', 'c', 'a', 't', 's'};
        System.out.println(String.copyValueOf(textArray));

        String unusualCat = "Котёнок по имени Гав";
        int start = 5;
        int end = 12;
        char[] buf = new char[end - start];
        unusualCat.getChars(start, end, buf, 0);
        System.out.println(buf);
    }
}
