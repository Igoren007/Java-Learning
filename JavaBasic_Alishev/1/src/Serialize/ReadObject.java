package Serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //1. считываем объекты по одному
            //Person person1 = (Person) ois.readObject();
            //Person person2 = (Person) ois.readObject();
            //System.out.println(person1);
            //System.out.println(person2);

            /*2. считываем несколько объектов. сначала считываем число объектов, потом каждый объект
            int personCount = ois.readInt();
            Person[] people = new Person[personCount];
            for (int i = 0; i < personCount; i++) {
                people[i] = (Person) ois.readObject();
            }
            System.out.println(Arrays.toString(people));
            */

            /*3. считываем весь массив целиком*/
            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
