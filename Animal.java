/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is the original object that we are going to
 * create. All other objects will inherit all of the
 * properties and abilities this object has. In some cases,
 * we will override the existing methods we will create
 * here.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Animal
{
	private int age;
	private boolean alive;
	private String sound;

	    /**
	     * Create a new animal with age zero (a new born).
	     */
	    public Animal()
	    {
			age = 0;
			alive = true;
	    }

		public Animal(int age, boolean alive, String sound)
		{
			this.age = age;
			this.alive = alive;
			this.sound = sound;
		}

	    /**
	    * Check whether the animal is alive or not.
	    * @return True if the animal is still alive.
	    */
        public boolean isAlive()
    	{
			return alive;
    	}

     	/**
     	* Make the animal die :(
     	*/
     	public void kill()
     	{
			alive = false;
     	}

		public int getAge()
		{
			return age;
		}

		public boolean getDeath()
		{
			return alive;
		}

		public void eat()
		{
			age++;
		}
	
     	/**
     	* Have the animal make a noise
     	* @return the string that is the animals sound it makes
     	*/
     	public String speak()
     	{
			sound = "";
     		return sound;
     	}

     	/**
     	* If you attempt to print the animal, if the animal is alive print its age and have it make
     	* a sound.  If the animal is dead, have it print how old it was when it died.
     	* @return String to be printed to the console.
     	*/
     	public String toString()
     	{
			if(alive)
				return "This cow is " + age + " years old." + " It makes a sound at you: Moooooooooooooo";
			else
				return "This cow was " + age + " years old when it passed away.";
     	}

		public boolean equals(Object obj)
		{
			if(this == obj)
				return true;
			
			if(this == null)
				return false;

			if(getClass() != this.getClass())
				return false;

			Animal next = (Animal)obj;

			return this.getAge() == next.getAge();
		}
}