public class MonsterMash{
  public static void main(String[] args){
    //Monster monster = new Monster();  NOT ALLOWED  
    //Because Monster has a modified constructor but not a default constructor
    //Monster does not INHERIT a default constructor
    Monster frankinstein = new Monster("Frankinstein");

    System.out.println(frankinstein);

    System.out.println(frankinstein.kill());

    Monster sally = new Witch("Sally");

    System.out.println(sally);
    
    System.out.println(sally.kill());

    System.out.println(((Witch)sally).fly());

    //Declare a Monster and declare the new type of Monster 
    //Bonus challenege: add an instance field

    Monster billy = new Skeleton("Billy");

    System.out.println(billy);

    System.out.println(billy.kill());

    System.out.println(((Skeleton)billy).laugh());

    System.out.println(((Skeleton)billy).damage());
  }
}
