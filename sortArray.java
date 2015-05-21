public class sortArray{

  public static void main(String[] args){
	
	  	int[][] m = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		
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
			  	else if(x != 5 && y == 1){
			  		System.out.print(m[x][y] + "},");
			  	}
				
		  	}
	  	}
	}
}
