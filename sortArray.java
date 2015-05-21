public class sortArray{

	public static void sort(int m[][]){
	
		for(int x = 0; x < 6; x++){
			for(int i = 1; i <= 5-x; i++){
				if(m[x+i][0] < m[x][0]){
					int temp = m[x+i][0];
					m[x+i][0] = m[x][0];
					m[x][0] = temp;
					int temp1 = m[x+i][1];
					m[x+i][1] = m[x][1];
					m[x][1] = temp1;
				}
			}
		}
		
		for(int x = 0; x < 6; x++){
			for(int i = 1; i <= 5-x; i++){
				if(m[x+i][0] == m[x][0] && m[x+i][1] < m[x][1]){
					int temp = m[x+i][1];
					m[x+i][1] = m[x][1];
					m[x][1] = temp;
				}
			}
		}
	
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
				else if(x != 5 && y == 1)
					System.out.print(m[x][y] + "},");
				
			}
		}
		
		System.out.println();
		
		sort(m);
	
	
	}
}
