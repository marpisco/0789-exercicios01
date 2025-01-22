
public class ex7_FahrenheitCelsius {

	public static void main(String[] args) {
		System.out.println("Calculadora Fahrenheit-Celsius v1.0");
		double tempFahren = Double.parseDouble(System.console().readLine("Qual é a temperatura em ºF? "));
		System.out.println(tempFahren + "ºF equivale a " + (((tempFahren - 32)/9)*5) + "ºC.");
		// Crédito da Fórmula de Cálculo: https://www.omnicalculator.com/pt/conversao/conversor-fahrenheit-para-celsius
	}

}
