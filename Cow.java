/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Cow extends Animal
{
    private double milkProduced = 0;
    public Cow()
    {
        super(0,true,"Moo");
    }

    public Cow(int age, boolean alive, String sound)
    {
        super(age,alive,sound);
    }

    public void eat()
    {
        super.eat();
        milkProduced++;
    }

    public String speak()
    {
        return "Moo";
    }

    public String toString()
    {
        return super.toString() + " and has produced " + milkProduced + " liters of milk.";
    }
}