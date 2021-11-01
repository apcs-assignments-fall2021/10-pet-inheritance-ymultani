public class Dog extends Pet {
    // Instance variable(s)
    private String breed;
    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed = breed;

    }
    public Dog(){
        super("Fido",4);
        this.breed = "Golden Retriever";

    }
    

    // makeNoise() method
    public void makeNoise(){
        System.out.println("WOOF");
    }


    // toString method
    public String toString(){
        String x = (getName() + ", a dog who is " + getAge() + "years old.");
        return x;
    }


    // Getter
    public String getBreed(){
        return this.breed;
    }



    // Setter
    public String setBreed(String b){
        this.breed = b;
        return this.breed;
    }
}