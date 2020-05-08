package pl.pwilkosz.javacourse.medium.constructors.singleton;

public class Demo {
    public static void main(String[] argc){
        Person p1 = Person.getInstance();
        Person p2 = Person.getInstance();

        System.out.println("Same? " + (p1 == p2));

        p1.withId(11);

        System.out.println(p1.getId() + " " + p2.getId());

    }
}
