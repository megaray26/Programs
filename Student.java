public class Student extends Person
{
   double gpa;
   
   public Student(double gpa, String name, int legs)
   {
      super(name, legs);
      this.gpa = gpa;
   }
   
   public boolean equals(Object obj)
   {
      if (!super.equals(obj))
      {
         return false;
      }
      if (this.gpa != ((Student)obj).gpa)
      {
         return false;
      }
      return true;
   }
   
   public String toString()
   {
      return (super.toString() + " and a Student Object with a " + gpa + " gpa");
   }
}