public class TestScores {
   private double test1;
   private double test2;
   private double test3;
   
   //constructor
   public TestScores(double test) {
      test1 = test;
      test2 = 0;
      test3 = 0;
   }
   //mutators
   public void setTest1(double test) {
      test1 = test;
   }
   public void setTest2(double test) {
      test2 = test;
   }
   public void setTest3(double test) {
      test3 = test;
   }
   //accessors
   public double getTest1() {
      return test1;
   }
   public double getTest2() {
      return test2;
   }
   public double getTest3() {
      return test3;
   }
   //calculate average
   public double getAverage() {
      final double noTests = 3;
      return (test1 + test2 + test3) / noTests;
   }
}