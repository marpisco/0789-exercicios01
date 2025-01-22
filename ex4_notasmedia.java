
public class ex4_notasmedia {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(System.console().readLine("Introduza a primeira nota deste bimestre: "));
		int n2 = Integer.parseInt(System.console().readLine("Introduza a segunda nota deste bimestre: "));
		int n3 = Integer.parseInt(System.console().readLine("Introduza a terceira nota deste bimestre: "));
		int n4 = Integer.parseInt(System.console().readLine("Introduza a quarta nota deste bimestre: "));
		System.out.println((n1+n2+n3+n4)/4);
	}

}
