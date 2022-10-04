package hw2;

public class Animal {
    private String name;
    //   private String noise;

    public Animal(String name) {
        this.name = name;
        //      this.noise = noise;

    }
    public Animal(){

    }

    public String noise(){
        String animalNoise= "unknown sound";
        return animalNoise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
