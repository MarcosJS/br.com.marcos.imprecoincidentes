//Class Coincidences that evaluates the sum of two variables x and y

package br.com.marcos.imprecoincidentes;

public class Coincidencias {
	
	public int[][] obterCoincidentesDuplos(int min, int max) {
		
		int[][] lista = new int[2][(max - min) + 1];//Numero de posicoes
		int k = 0;
		
		for(int x = min; x <= max; x++) {
			
			for(int y = max;y >= min; y--) {
				
				if((x + y == min) || (x + y == max)) {
					lista[0][k] = x;
					lista[1][k] = y;
					k++;
					break;
				}
			}
		}
		
		return lista;
	}
}
