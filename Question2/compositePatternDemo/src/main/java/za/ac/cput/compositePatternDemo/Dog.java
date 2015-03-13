package za.ac.cput.compositePatternDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 2015/03/10.
 */
public class Dog implements Pet{

    private String name;
    private int age;
    Dog(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    List<Pet> pet = new ArrayList<Pet>(2);
    @Override
    public void add(Pet pet) {
        pet.add(pet);
    }

    @Override
    public void remove(Pet pet) {
        pet.remove(pet);
    }

    @Override
    public Pet getPet(int p) {
        return pet.get(p);
    }

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

        Iterator<Pet> petIterator = pet.iterator();
        while (petIterator.hasNext()) {
            getPetInfo();
        }
        return "Name : "+name+ " Age : "+age+" ";
    }
}
