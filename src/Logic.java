
public class Logic {
	public void spiral(int a) {
		int minColumn=0;
		int minRow=0;
		int maxRow=a-1;
		int maxColumn=a-1;
		int count=1;
		int[][] arr=new int[a][a];
		while (count<=a*a) {
			for (int i=minColumn; i<=maxColumn; i++) {
				arr[i][minRow]=count;
				count++;				
			}
			for (int j=minRow+1; j<=maxRow; j++) {
				arr[maxColumn][j]=count;
				count++;
			}
			for(int i=maxColumn-1; i>=minColumn; i--) {
				arr[i][maxRow]=count;
				count++;
			}
			for(int j=maxRow-1; j>=minRow+1; j--) {
				arr[minColumn][j]=count;
				count++;
			}
			minColumn++;
			minRow++;
			maxColumn--;
			maxRow--;
		}

		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i][j]+ ",");
			}
			System.out.print("\n");
		}
		
		
	}
}