package program;

/*
beecrowd | 1064 - Positivos e Média

Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados,
com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante.
Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos.
A próxima linha deve mostrar a média dos valores positivos digitados.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int positivo = 0;
		double media = 0;
		
		for(int i = 0; i <6; i++) {
			double valores = sc.nextDouble();
			if(valores >= 0) {
				positivo ++;
				media += valores;
			}
		}
		System.out.println(positivo + " valores positivos");
		System.out.printf("%.1f\n", media / positivo);
		sc.close();
	}
}
