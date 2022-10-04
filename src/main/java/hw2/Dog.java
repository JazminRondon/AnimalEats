package hw2;

public class Dog extends Animal {
    public Dog(String name) {

        super(name);
    }
    public Dog(){

    }
    public String noise(){
        String dogNoise= "woof";
        return dogNoise;
    }
}
