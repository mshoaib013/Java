package extend;

public class Pet{
    public int age;
    protected String sound;
    public String name;
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }



	public void getSound(){

    System.out.println(sound);
}
    public int getAge() {

    return age;
    }
}

