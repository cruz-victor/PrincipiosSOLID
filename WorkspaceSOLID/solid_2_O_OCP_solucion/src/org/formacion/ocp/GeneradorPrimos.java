package org.formacion.ocp;

import java.util.ArrayList;
import java.util.List;

public class GeneradorPrimos {

	private int limit;
		
	public List<Integer> primos () {
		
		List<Integer> primos = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (esPrimo(i)) {
				primos.add(i);
			}
		}
		return primos;

	}
	
	private boolean esPrimo (int candidato) {
		for (int i = 2; i < candidato; i++) {
			if (candidato % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public List<Integer> ordenar(IOrdenacion ordenacion) {
		return ordenacion.ordenar(this.primos());
	}
	
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
}
