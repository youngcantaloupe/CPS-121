public class RainfallClass {
   private double[] rain;
   
   public RainfallClass(double r[]) {
      rain = new double[r.length];
      
      for (int i = 0; i < r.length; i++) {
         rain[i] = r[i];
      }
   }
   public double getTotalRainFall() {
      double total = 0.0;
      
      for (int i = 0; i < rain.length; i++)
         total += rain[i];
         
      return total;
   }
   
   public double getAverageRainFall() {
      return getTotalRainFall() / rain.length;
   }
   
   public int getHighestMonth() {
      int highest = 0;
   
      for (int i = 1; i < rain.length; i++) {
         if (rain[i] > rain[highest]) {
         highest = i;
         }
      }
      return highest;
      }
   
   public int getLowestMonth() {
      int lowest = 0;
      
      for (int i = 1; i < rain.length; i++) {
         if (rain[i] < rain[lowest]) {
         lowest = i;
         }
      }
      return lowest;
   }
   public double getRainAt(int e) {
      return rain[e];
   }
}