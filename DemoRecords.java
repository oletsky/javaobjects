package newfeatures;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 * Illustrating records (preview feature for Java 14)
 */
public class DemoRecords {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Ivanov",102));
        list.add(new Person("Petrova",25));
        System.out.println(list.get(0).name());
        System.out.println(list);
    }
}

record Person (String name, int age) {
    @Override
    public String toString() {
        return  name + " - " + age;
    }
}
