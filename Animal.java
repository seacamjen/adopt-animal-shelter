class Animal {
  public int mAge;
  public String mSpecies;
  public String mGender;
  public int mWeight;
  public int mHeight;

  public boolean insidePet(int maxWeight){
    return (mWeight < maxWeight);
  }
}
