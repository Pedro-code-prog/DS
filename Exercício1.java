
public class Exercício1 {
	public static void main(String[] args) {
		
		int [][] m = new int [2][3];
		int t=0;
		
		m[0][0] = 2;
		m[0][1] = 7;
		m[0][2] = 5;
		m[1][0] = 9;
		m[1][1] = 1;
		m[1][2] = 3;
		
		//exibicao da matriz 
		//linha
		
		for(int i=0; i<2; i++) {
			//incrementando i
			for(int j=0; j<3; j++) {
				//System.out.print(m[i][j]);
				t+=m[i][j];
			}
			System.out.println();
		}
		System.out.println(t);
	}
}
