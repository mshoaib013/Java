package extend;

public class Dog extends Pet {
    public Dog(String name, int age ) {
        super(name, age);
        super.sound = "Woof woof woof!!";
    }
    public void fetch(String something) {

        System.out.println("I have fetched " + something + " for admin");
    }

}