package conv;

public class Conversor {

	public static double cotacaoDoDolar = 4.83;
	public static double iof = cotacaoDoDolar * 6 / 100;
	
	public static void dolar(double valor) {
		double reais = (cotacaoDoDolar + iof) * valor;
		
		System.out.printf("Cotação do Dólar R$: %.2f%n",cotacaoDoDolar);
		System.out.printf("Valor do IOF R$: %.2f",iof);
		System.out.printf("\nDólares comprados $: %.2f%n",valor);
		System.out.printf("Total de Reais à pagar R$: %.2f%n",reais);
	}

}
