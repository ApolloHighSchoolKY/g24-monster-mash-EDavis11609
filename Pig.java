public class Pig extends Animal 
{
    private double weight = 0;

    public Pig()
    {
        super(0,true,"oink");
    }

    public Pig(int age, boolean alive, String sound)
    {
        super(age,alive,sound);
    }

    public void eat()
    {
        super.eat();
        weight = weight + 5;
    }

    public String speak()
    {
        return "Oink";
    }

    public String toString()
    {
        return super.toString() + " weights " + weight + " pounds. Ooooo more bacon.";
    }
}