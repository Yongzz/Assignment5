package za.ac.cput.compositePatternDemo;

/**
 * Created by student on 2015/03/10.
 */
public class Rottweiler implements Pet{

    private int age;
    private String name;

    Rottweiler(int a, String n)
    {
        age = a; name = n;
    }
    @Override
    public void add(Pet pet) {}
    @Override
    public void remove(Pet pet){}
    @Override
    public Pet getPet(int p) {return null;}
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getPetInfo() {
        return "Name : "+name+ " Age : "+age;
    }
}
