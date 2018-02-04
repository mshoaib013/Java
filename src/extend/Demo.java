package extend;

public class Demo{

    public static void main(String []args){
        //Dog dog1 = new Dog ("aa", 2);
        Dog dog1 = new Dog("Tommy",2);


        System.out.println("Name : " + dog1.name);
        System.out.println("Name : " + dog1.sound);
        System.out.println("Name : " + dog1.getAge());

        dog1.getSound();
        dog1.fetch("Ml");
    }

}
