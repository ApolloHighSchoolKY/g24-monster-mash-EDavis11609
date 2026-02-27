/**
 * @(#)Farm.java
 * Create an Array list of animals
 * populate it with various types of animals
 * ploymorphism- ta daa
 *
 * @author Elijah Davis
 * @version 1.00 2026/2/25
 */
    import java.util.ArrayList;

public class Farm {

    public static void main (String[] args)
    {
        ArrayList<Animal> farm = new ArrayList<Animal>();

        farm.add(new Pig());
        farm.add(new Pig(6,true,"Oink"));
        farm.add(new Cow());
        farm.add(new Cow(2,true,"Moo"));

        for(Animal animal : farm)
        {
            System.out.println(animal.speak());

            if(animal.getAge()>5)
            {
                animal.kill();
            }
        }
    }

}