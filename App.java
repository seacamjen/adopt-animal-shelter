import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    Animal cat = new Animal();
    cat.mAge = 2;
    cat.mSpecies = "Siamese";
    cat.mGender = "Male";
    cat.mWeight = 5;
    cat.mHeight = 10;

    System.out.println("What is the max weight of animals in your house?");
    int maxWeight = Integer.parseInt(console.readLine());

    System.out.println("Animals: ");

    Animal[] animals = {cat};

    for(Animal animal : animals) {
      if ( animal.insidePet(maxWeight)){
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
