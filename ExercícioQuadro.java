import java.util.Scanner;
public class ExercícioQuadro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] m = new int [3][3];
		
		m[0][0] = 1;
		m[0][1] = 2;
		m[0][2] = 3;
		m[1][0] = 4;
		m[1][1] = 5;
		m[1][2] = 6;
		m[2][0] = 7;
		m[2][1] = 8;
		m[2][2] = 9;
		
		for(int i=0; i<3; i++) {
			//incrementando i
			for(int j=0; j<3; j++) {
				if(i == j) {
				System.out.print(m[i][j]);
				}
			}
		}
	}
}
