import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    Animal cat = new Animal (2, "Siamese", "Male", 5, 10);
    Animal dog = new Animal(4, "Greyhound", "Female", 7, 27);
    Animal horse = new Animal(3, "Brown", "Male", 150, 50);
    Animal mouse = new Animal(6, "White", "Female", 1, 3);
    Animal donkey = new Animal(5, "Black", "Male", 90, 45);

    List<Animal> animals = new ArrayList<Animal>();
    animals.add(cat);
    animals.add(dog);
    animals.add(horse);
    animals.add(mouse);
    animals.add(donkey);

    donkey.setAdoptedTrue();

    boolean programRunning = true;

    while(programRunning) {
      System.out.println("Welcome to our animal shelter. What would you like to do? Enter one of the following options: All Animals, Unadopted Animals, Inside Animals, Add Animal, or Exit:");
      String navigationChoice = console.readLine();

      if(navigationChoice.equals("All Animals")) {
        for(Animal animal : animals) {
          displayAnimal(animal);
        }
      } else if(navigationChoice.equals("Unadopted Animals")) {
        for(Animal animal : animals) {
          if (!animal.mAdopted) {
            displayAnimal(animal);
          }
        }
      } else if(navigationChoice.equals("Inside Animals")) {
        System.out.println("What is the max weight of animals in your house?");
        int maxWeight = Integer.parseInt(console.readLine());

        System.out.println("What is the max age of animals in your house?");
        int maxAge = Integer.parseInt(console.readLine());

        for(Animal animal : animals) {
          if ( animal.insidePet(maxWeight, maxAge)){
            displayAnimal(animal);
          }
        }
      } else if(navigationChoice.equals("Add Animal")) {
        System.out.println("What is the animal's age?");
        int userAge = Integer.parseInt(console.readLine());
        System.out.println("What is the animal's species?");
        String userSpecies = console.readLine();
        System.out.println("What is the animal's gender?");
        String userGender = console.readLine();
        System.out.println("What is the animal's weight?");
        int userWeight = Integer.parseInt(console.readLine());
        System.out.println("What is the animal's height?");
        int userHeight = Integer.parseInt(console.readLine());
        Animal userAnimal = new Animal(userAge, userSpecies, userGender, userWeight, userHeight);
        animals.add(userAnimal);
      } else if(navigationChoice.equals("Exit")) {
        programRunning = false;
      } else {
        System.out.println("Unexpected input!");
      }
    }
  }

  public static void displayAnimal(Animal animal) {
    System.out.println("-------------------");
    System.out.println(animal.mAge);
    System.out.println(animal.mSpecies);
    System.out.println(animal.mGender);
    System.out.println(animal.mWeight);
    System.out.println(animal.mHeight);
    System.out.println(animal.mAdopted);
  }
}
