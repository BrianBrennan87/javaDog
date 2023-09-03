public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("snoppy", 12, "black");
        Dog dog2 = new Dog("Spot", 7, "brown");
        Dog dog3 = new Dog("wolf", 3, "orange");

        System.out.println("Dogs Name: " + dog1.getName());
        System.out.println("Dogs Age: " + dog1.getAge());
        System.out.println("Dogs Color: " + dog1.getColor());
        dog1.walk();
        dog1.sit();
        dog1.bark();

        System.out.println("Dogs Name: " + dog2.getName());
        System.out.println("Dogs Age: " + dog2.getAge());
        System.out.println("Dogs Color: " + dog2.getColor());
        dog2.walk();
        dog2.sit();
        dog2.bark();

        System.out.println("Dogs Name: " + dog3.getName());
        System.out.println("Dogs Age: " + dog3.getAge());
        System.out.println("Dogs Color: " + dog3.getColor());
        dog3.walk();
        dog3.sit();
        dog3.bark();

    }
}
