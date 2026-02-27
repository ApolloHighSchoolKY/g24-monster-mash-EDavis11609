public class Skeleton extends Monster{
    private double speed;

    public Skeleton()
    {
        speed = 50;
    }

    public Skeleton(String name)
    {
        super(name);
        speed = 50;
    }

    public Skeleton(String name, double speed)
    {
        super(name);
        this.speed = speed;
    }

    //override kill
    public String kill()
    {
         return  "\n" + getName() + " blew up the princess and her tower with his bomb\n";
    }

    public String laugh()
    {
        return getName() + " the giant skeleton laughs at the face of his enemies \n";
    }

    public String damage()
    {
        String damage = "200";

        return  getName() + " dealt " + damage + " damage";
    }

    public String toString()
    {
        return super.toString() + " can run at " + speed + " miles per hour.";
    }


}