	import javax.swing.JOptionPane;
	
	public class Sales {
		public static void main(String[] args) {
		
			final int ONE_WEEK = 7;
			
			double[] sales = new double[ONE_WEEK];
			
			getValues(sales);
			
			SalesData week = new SalesData(sales);
			
			JOptionPane.showMessageDialog(null, String.format( 
				"Total: $%,.2f\n" +
				"Average: $%,.2f\n" +
				"Lowest: $%,.2f\n" +
				"Highest: $%,.2f\n",
				week.getTotal(),
				week.getAverage(),
				week.getLowest(),
				week.getHighest()));
				
		System.exit(0);
		}
		private static void getValues(double[] array) {
			String input; 
			
			for (int i = 0; i < array.length; i++) {
				input = JOptionPane.showInputDialog("Sales for day " + (i + 1) + ".");
				array[i] = Double.parseDouble(input);
			}
		}
	}

