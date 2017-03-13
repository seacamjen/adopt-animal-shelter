public class App {
  public static void main(String[] args) {
    Animal cat = new Animal();
    cat.mAge = 2;
    cat.mSpecies = "Siamese";
    cat.mGender = "Male";
    cat.mWeight = 5;
    cat.mHeight = 10;

    System.out.println("Animals: ");

    Animal[] animals = {cat};

    for(Animal animal : animals) {
      System.out.println("-------------------");
      System.out.println(animal.mAge);
      System.out.println(animal.mSpecies);
      System.out.println(animal.mGender);
      System.out.println(animal.mWeight);
      System.out.println(animal.mHeight);
    }
  }
}
