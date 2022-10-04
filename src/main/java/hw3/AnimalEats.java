package hw3;
import java.util.ArrayList;

public class AnimalEats {
    public static void display(ArrayList<Animal> array) {
        for (int x = 0; x < array.size(); x++) {
            System.out.println( array.get(x).getName()  + "s eat " + array.get(x).getFood() );
        }
    }

    public static void main(String[] args) {
        ArrayList<Animal> array = new ArrayList<Animal>();
        Animal dog = new Animal("Dog", "Dog food");
        Animal cat = new Animal("Cat", "Cat food");
        Animal frog = new Animal("Frog", "Frog food");

        array.add(dog);
        array.add(cat);
        array.add(frog);
        display(array);

    }
//    public static void display(ArrayList<Animal> array) {

//        for (int x = 0; x < array.size(); x++) {

//            System.out.println( array.get(x).getName()  + "s eat " + array.get(x).getFood() );


//        }



}