package OrdenaçãoLinear;

public class InsertionSort implements Strategy {

	@Override
	public int[] ordena(int[] vector, int ini, int end) {
	
		int chave, aux;
		
		for (int i = 0; i < vector.length; i++) {
			chave = vector[i];
			aux = i-1;
			while(aux >= 0 && vector[aux] > chave){
				vector[aux+1] = vector[aux];
				aux -= 1;
			}
			vector[aux+1] = chave;
		}
		return vector;
	}

}
