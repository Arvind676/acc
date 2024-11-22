package accentDayTwo;

public class CanopyArea {

	public class CircleArea {

	    public static int calculateArea(int input1){
	      double A = 3.14*input1*input1;
	      
	      if(A- (int)A > 0.5){
	        return (int)A+1;
	      }
	      else{
	        return (int)A;
	      }
	  
	      
	    }

	    public static void main(String[] args) {
	        // Example input
	        int input1 = 5; // Radius of the circle

	        // Call the method and print the result
	        int result = calculateArea(input1);
	        System.out.println(result);
	    }
	}

}
