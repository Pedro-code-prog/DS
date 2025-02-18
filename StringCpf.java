import java.util.Scanner;
public class StringCpf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cpf, cpfFormatado;
		
		System.out.println("Escreva seu CPF sem formatação");
		cpf = sc.next();
		
		String d1 = cpf.substring(0,3);
		String d2 = cpf.substring(3,6);
		String d3 = cpf.substring(6,9);
		String d4 = cpf.substring(9,11);
		
		cpfFormatado = d1 + "." + d2 + "." + d3 + "-" + d4;
		
		System.out.println(cpfFormatado);
	}
}
