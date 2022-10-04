package hw2;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    public Cat(){

    }

    public String noise(){
        String catNoise= "meow";
        return catNoise;
    }
}