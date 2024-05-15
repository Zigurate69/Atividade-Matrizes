package LPAlore;

import java.util.Scanner;

public class Lpalesson46 {

	public static void main(String[] args) { 

		Scanner ler = new Scanner(System.in);  

		int m [][] = new int [5][5]; 

		int soma = 0; 

		int numero = 1; 

		for (int i = 0; i<5; i++) { 

			for (int j = 0; j<5; j++) { 

				numero = (int)Math.round(Math.random()* 50 + 1)* 2; 

				m[i][j] = numero; 

				soma += numero; 
			} 
		} 
		System.out.println("Matriz que possui somente números pares:"); 

		for (int i = 0; i < 5; i++) { 

			for(int j = 0; j < 5; j++) { 

				System.out.print(m[i][j] + "\t"); 
			} 
			System.out.println(); 
		} 
		System.out.println("Soma dos valores que estão dentro da matriz: " + soma); 
	} 
} 