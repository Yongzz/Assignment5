package za.ac.cput.compositePatternDemo;

/**
 * Created by student on 2015/03/10.
 */
public interface Pet {
    public void add(Pet pet);
    public void remove(Pet pet);
    public Pet getPet(int p);
    public String getName();
    public int getAge();
    public String getPetInfo();

}
