public class Animal
{
   private int legs;
   
   public Animal(int legs)
   {
      this.legs = legs;
   }
   
   public boolean equals(Object obj)
   {
      if (obj == null)
      {
         return false;
      }
      if (this.getClass() != obj.getClass())
      {
         return false;
      }
      if (this.legs != ((Animal)obj).legs)
      {
         return false;
      }
      return true;
   }
   
   public String toString()
   {
      return "I am an Animal object with " + legs + " legs";
   }
}