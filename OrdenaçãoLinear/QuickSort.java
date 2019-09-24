package OrdenaçãoLinear;

public class QuickSort implements Strategy {

	@Override
	public int[] ordena(int[] vector, int ini, int end) {
	        if (ini < end) {
	               int posicaoPivo = separar(vector, ini, end);
	               ordena(vector, ini, posicaoPivo - 1);
	               ordena(vector, posicaoPivo + 1, end);
	               return vector;
	        }
	        return null;
	  }

	  private int separar(int[] vetor, int inicio, int fim) {
	        int pivo = vetor[inicio];
	        int i = inicio + 1, f = fim;
	        while (i <= f) {
	               if (vetor[i] <= pivo)
	                      i++;
	               else if (pivo < vetor[f])
	                      f--;
	               else {
	                      int troca = vetor[i];
	                      vetor[i] = vetor[f];
	                      vetor[f] = troca;
	                      i++;
	                      f--;
	               }
	        }
	        vetor[inicio] = vetor[f];
	        vetor[f] = pivo;
	        return f;
	  }
}


