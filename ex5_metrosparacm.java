
public class ex5_metrosparacm {

	public static void main(String[] args) {
		System.out.println("Calculadora de metros para cm v1.0");
		double metros = Double.parseDouble(System.console().readLine("Introduza os metros para converter em cm: "));
		System.out.println("O valor de " + metros + "m equivale a " + (metros*100) + "cm.");
	}

}
