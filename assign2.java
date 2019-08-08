package assign2;

public class assign2 {

	public static void main(String[] args){
		
		drawX(5);
	}
	public static void drawX(int height){
		//First half of the X
		for(int i = 0; i <= height / 2 - 1; i++){
			//Print first spaces
			for(int j = 0; j <= i; j++){
				System.out.print(" ");
			}
			System.out.print("X");
			//print second spaces
			for(int j = 0; j < height - (2 * (i + 1)); j++){
				System.out.print(" ");
			}
			System.out.println("X");
		}
		//Print the middle of the X
		for(int i = 0; i < height / 2 + 1; i++){
			System.out.print(" ");
		}
		System.out.println("X");
		//Second half of the X
		for(int i = 0; i <= height/2 - 1; i++){
			//Print First Spaces
			for(int j = height/ 2 - (1 * (i)); j > 0; j--){
				System.out.print(" ");
			}
			System.out.print("X");
			
			//Print the 2nd spaces
			for(int j = 0; j < 1 + (2*i); j++){
				System.out.print(" ");
			}
			System.out.println("X");
			
		}
	}
	}
	
