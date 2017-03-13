class Animal {
  public int mAge;
  public String mSpecies;
  public String mGender;
  public int mWeight;
  public int mHeight;
  public boolean mAdopted;

  public Animal( int age, String species, String gender, int weight, int height){
    mAge = age;
    mSpecies = species;
    mGender = gender;
    mWeight = weight;
    mHeight = height;
    mAdopted = false;
  }

  public boolean insidePet(int maxWeight, int maxAge){
    return (mWeight < maxWeight && mAge < maxAge);
  }

  public void setAdoptedTrue() {
    mAdopted = true;
  }


}
