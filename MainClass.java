public class MainClass
{
   public static void main(String[] args)
   {
      animalTests();
   }
   
   public static void animalTests()
   {
      Student student = new Student(999.9, "Raymond", 2);
      Student student2 = new Student(999, "Michael", 8);
      
      System.out.println(student.equals(student2));
      System.out.println(student.toString()+"\n"+student2.toString());
   }
}