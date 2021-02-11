package WorkWithFIles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        //String path = "C:\\Users\\iag\\Desktop\\telega_bot.txt";
        String path = "C:\\Users\\iag\\Desktop\\test.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        /*
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        */
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[5];
        int counter = 0;
        for(String number:numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();

    }
}
