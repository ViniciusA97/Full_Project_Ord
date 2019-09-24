package OrdenaçãoLinear;

import java.util.Scanner;

public class Projeto {
	
	static final String N1 = "src\\num.1000.1.in";
	static final String N2 = "src\\num.1000.2.in";
	static final String N3 = "src\\num.1000.3.in";
	static final String N4 = "src\\num.1000.4.in";
	
	static final String N5 = "src\\num.10000.1.in";
	static final String N6 = "src\\num.10000.2.in";
	static final String N7 = "src\\num.10000.3.in";
	static final String N8 = "src\\num.10000.4.in";
	
	static final String N9 = "src\\num.100000.1.in";
	static final String N10 = "src\\num.100000.2.in";
	static final String N11 = "src\\num.100000.3.in";
	static final String N12 = "src\\num.100000.4.in";
	
	public static void main(String[] args) {
		
		boolean cond = true;
		Scanner in = new Scanner(System.in);
		int [] vector;
		LeituraORD leitura = new LeituraORD();
		Strategy strategy = null ;
		String entrada = "";
		while(cond) {
			
			System.out.println("\nEscolha um arquivo e um método para ordenar: \n"
					+ "1- num.1000.1.in \n"
					+ "2 -num.1000.2.in \n"
					+ "3 -num.1000.3.in \n"
					+ "4 -num.1000.4.in \n \n"
					+ "5 -num.10000.1.in \n"
					+ "6 -num.10000.2.in \n"
					+ "7 -num.10000.3.in \n"
					+ "8 -num.10000.4.in \n \n"
					+ "9 -num.100000.1.in \n"
					+ "10 -num.100000.2.in \n"
					+ "11 -num.100000.3.in \n"
					+ "12 -num.100000.4.in \n \n"
				);
			entrada = in.nextLine();
			switch(entrada) {
				case "1":
					
					vector = leitura.ler(N1);
					break;
				case "2":
					
					vector = leitura.ler(N2);
					break;
					
				case "3":
					
					vector = leitura.ler(N3);
					
					break;
				case "4":
					
					vector = leitura.ler(N4);
					break;
				
				case "5":
					
					vector = leitura.ler(N5);
					
					break;
				case "6":
					
					vector = leitura.ler(N6);
					break;
				
				case "7":
				
					vector = leitura.ler(N7);
					break;
				
				case "8":
					
					vector = leitura.ler(N8);
					break;
					
				case "9":
					
					vector = leitura.ler(N9);
					break;
					
				case "10":
					
					vector = leitura.ler(N10);
					break;
					
				case "11":
					
					vector = leitura.ler(N11);
					break;
				case "12":
					
					vector = leitura.ler(N12);
					break;
				default:
					vector = leitura.ler(N1);
					cond = false;
			}
			
			System.out.println("\nEscolha um arquivo e um método para ordenar: \n"
					+ "1- insertionSort \n"
					+ "2- SelectionSort \n"
					+ "3- QuickSort \n"
					+ "4 -MergeSort \n "
					+ "5- exit"
				);
			
			entrada = in.nextLine();
		
			switch (entrada) {
				case"1":
					strategy = new InsertionSort();
					break;
				case "2":
					strategy = new SelectionSort();
					break;
				case "3": 
					strategy = new QuickSort();
					break;
				case "4":
					strategy = new MergeSort();
					break;
				case "5":
					cond = false;
					break;
				default:
					strategy = new InsertionSort();
					break;
			}
			vector = strategy.ordena(vector, 0, vector.length);
			print(vector);
		}	
		
		
		
		
	}
	
	public static void print(int [] vector) {
		for(int i : vector) {
			System.out.println(i);
		}
	}
	
  
}

