
public class ex6_salario {

	public static void main(String[] args) {
		System.out.println("Calculadora de Salários v1.0");
		double salPorHora = Double.parseDouble(System.console().readLine("Quanto é que ganha por hora? "));
		int horasTrab = Integer.parseInt(System.console().readLine("Quantas horas trabalhou neste mês? "));
		System.out.println("Deve de receber " + (horasTrab*salPorHora) + "€ neste mês.");
	}

}
