public class newPattn {
	public static void main (String[] args) {
	int i, j, n;
	n = 9; 
	for (i = 0; i<=n; i ++) {
		for (j = 1; j<=n-i; j++) {
			System.out.print("value is: " + j + " "); 	
		}
			System.out.println(" "); 
		}
	}
}