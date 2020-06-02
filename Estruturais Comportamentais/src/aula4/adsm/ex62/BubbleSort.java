package aula4.adsm.ex62;

import java.util.Arrays;

public class BubbleSort implements Ordenacao {

	public void ordenar(int v[]) {
		for (int i = v.length - 1; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (v[j] > v[j + 1]) {
					int aux = v[j + 1];
					v[j + 1] = v[j];
					v[j] = aux;
				}
			}
		}
		System.out.println("BubbleSort: " +Arrays.toString(v));
	}

}
