package Serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        //Person person1 = new Person(1, "Boby");
        //Person person2 = new Person(2, "Jonny");
        Person[] people = {new Person(1, "Boby"), new Person(2, "Bill"), new Person(3, "Kate")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //1. запись объектов по одному
            //oos.writeObject(person1);
            //oos.writeObject(person2);

            /*2. запись массива объектов по одному. в начале длину массива, потом сами объекты
            oos.writeInt(people.length);
            for (Person person:people) {
                oos.writeObject(person);
            }
             */
            /* 3. записываем весь массив целиком*/
            oos.writeObject(people);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
