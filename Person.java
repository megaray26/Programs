public class Person extends Animal
{
   private String name;
   public Person(String name, int legs)
   {
      super(legs);
      this.name = name;
   }
   
   public boolean equals(Object obj)
   {
      if (!super.equals(obj))
      {
         return false;
      }
      String otherName = ((Person)obj).name;
      if (!name.equals(otherName))
      {
         return false;
      }
      return true;
   }
   
   public String toString()
   {
      return (super.toString() + " and a Person object whose name is " + name);
   }
}