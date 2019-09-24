package OrdenaçãoLinear;
	
	public class SelectionSort implements Strategy {

		@Override
	public int[] ordena(int[] vector, int ini, int end) {
			int i, j;
			int min, temp;
			int array_size = vector.length;
			for (i = 0; i < array_size-1; i++){
		  
				min = i;
			    for (j = i+1; j < array_size; j++){
			    
			    	if (vector[j] < vector[min]) min = j;
			    
			    }
			    
			    temp = vector[i];
			    vector[i] = vector[min];
			    vector[min] = temp;
		}
		return vector;
	}

}