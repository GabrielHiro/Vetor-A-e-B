package vertoresAB;

import java.util.Scanner;

public class vetoresAB {
	@SuppressWarnings({ "resource"}) //suprimir ou ignorar avisos do compilador
	public static void main(String[] args) {
		
	// Novo Scanner: ("ler")
	
	Scanner ler = new Scanner(System.in);
	
	// Variaveis 
	
	int x = 0;					//contagem do for
	
	int vet_a[] = new int[5];	//Vetor A
	
	int vet_b[] = new int[5];  	//Vetor B
	
	float c = 0;				//Resultado
	
	//Leitura do Vetor A
	
	for(x=0;x<5;x++) {
		System.out.printf("\n Digite Valor de A: ");
		vet_a[x]= ler.nextInt(); //leitura de A vetor
	}
	
	//Leitura do Vetor B
	for(x=0;x<5;x++) {
		System.out.printf("\n Digite Valor de B: ");
		vet_b[x]= ler.nextInt(); //leitura de B vetor
	}
	
	//Calculo dos vetores
	for(x = 0;x<5;x++) {
		c = c + vet_a[x] * vet_b[x]; //resultado = VETOR_A + VETOR_B
	}
	
	System.out.printf("\n Valor Total %.2f", c); //Exibição do resultado
	}
}
