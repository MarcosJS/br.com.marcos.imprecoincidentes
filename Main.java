//Program that shows the sum of two values whose sum is equal to 100 or -100 "Impression of Coincidents_v1.0.0"

package br.com.marcos.imprecoincidentes;

public class Main {
	public static void main(String[] args) {
		
		int maximo = 100, minimo = -100;
		int[][] valores;
		Coincidencias coincidentes = new Coincidencias();
		valores = coincidentes.obterCoincidentesDuplos(minimo, maximo);
		
		for(int i = 0; i <=  (maximo - minimo); i++){
			System.out.println(valores[0][i]+"+"+valores[1][i]+" é igual a "+(valores[0][i] + valores[1][i]));
		}
		
	}

}
