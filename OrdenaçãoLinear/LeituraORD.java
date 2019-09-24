package OrdenaçãoLinear;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraORD {

	
	
	public int [] ler(String nome) {
		int[] vector =new int [0];
		try {
		      FileReader arq = new FileReader(nome);
		      BufferedReader lerArq = new BufferedReader(arq);
		      String linha = lerArq.readLine(); 
		      int i = Integer.parseInt(linha);
		      vector = new int [i];
		      int cont = 0;
		      
		      while (linha!=null) {
		        
		    	
		        linha = lerArq.readLine();
		        if(linha==null) break;
		        i = Integer.parseInt(linha);
		        vector[cont++] = i;
		      }
		 
		      arq.close();
		    } catch (IOException e) {
		        System.err.printf("Erro na abertura do arquivo: %s.\n",
		          e.getMessage());
		    }
		
		return vector;
	}
}
