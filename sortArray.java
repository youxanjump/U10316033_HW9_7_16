/*This program is just to be used to arrange the "coordinate" that stored in array**/

public class sortArray{
	//a method to arrange the coordinate
	public static void sort(int m[][]){
		//the first part arrange
		for(int x = 0; x < 6; x++){
			for(int i = 1; i <= 5-x; i++){
				if(m[x+i][0] < m[x][0]){
					//switch the x coordinate
					int temp = m[x+i][0];
					m[x+i][0] = m[x][0];
					m[x][0] = temp;
					//switch the y coordinate
					int temp1 = m[x+i][1];
					m[x+i][1] = m[x][1];
					m[x][1] = temp1;
				}
			}
		}
		//the second part arrange
		for(int x = 0; x < 6; x++){
			for(int i = 1; i <= 5-x; i++){
				if(m[x+i][0] == m[x][0] && m[x+i][1] < m[x][1]){
					//if the x coordinate is identical, arrange the y coordinate from little to large
					int temp = m[x+i][1];
					m[x+i][1] = m[x][1];
					m[x][1] = temp;
				}
			}
		}
		//print the result 
		for(int x = 0; x < 6; x++){
			for(int y = 0; y < 2; y++){
				if(x == 0 && y == 0){
					System.out.print("{{" + m[x][y] + ",");
				}
				else if(x == 5 && y == 1){
					System.out.print(m[x][y] + "}}");
				}
				else if(x != 0 && y == 0){
					System.out.print("{" + m[x][y] + ",");
				}
				else if(x != 5 && y == 1)
					System.out.print(m[x][y] + "},");
				
			}
		}
		
	}
	
	public static void main(String[] args){
		//the array
		int[][] m = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		//print the array
		System.out.println("The original coordinate is :");
		for(int x = 0; x < 6; x++){
			for(int y = 0; y < 2; y++){
				if(x == 0 && y == 0){
					System.out.print("{{" + m[x][y] + ",");
				}
				else if(x == 5 && y == 1){
					System.out.print(m[x][y] + "}}");
				}
				else if(x != 0 && y == 0){
					System.out.print("{" + m[x][y] + ",");
				}
				else if(x != 5 && y == 1)
					System.out.print(m[x][y] + "},");
				
			}
		}
		
		System.out.println("\nAfter arrange from little to large :");
		//call the method
		sort(m);
	
	
	}
}
