import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    Animal cat = new Animal (2, "Siamese", "Male", 5, 10);
    Animal dog = new Animal(4, "Greyhound", "Female", 7, 27);
    Animal horse = new Animal(3, "Brown", "Male", 150, 50);
    Animal mouse = new Animal(6, "White", "Female", 1, 3);
    Animal donkey = new Animal(5, "Black", "Male", 90, 45);

    System.out.println("What is the max weight of animals in your house?");
    int maxWeight = Integer.parseInt(console.readLine());

    System.out.println("What is the max age of animals in your house?");
    int maxAge = Integer.parseInt(console.readLine());

    System.out.println("Animals: ");

    Animal[] animals = {cat, dog, horse, mouse, donkey};

    for(Animal animal : animals) {
      if ( animal.insidePet(maxWeight, maxAge)){
        System.out.println("-------------------");
        System.out.println(animal.mAge);
        System.out.println(animal.mSpecies);
        System.out.println(animal.mGender);
        System.out.println(animal.mWeight);
        System.out.println(animal.mHeight);
      }
    }
  }
}
