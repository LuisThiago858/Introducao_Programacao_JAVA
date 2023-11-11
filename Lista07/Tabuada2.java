/*
 * Enunciado
Tabuada v2
Crie uma classe que contenha 2 atributos do tipo inteiro.
Seu programava deverá ler dois valores N e Q, e deve imprimir a tabuada entre esses dois valores.
Dicas
É obrigatório o uso do comando for.
Suponha que N sempre será menor que Q.
Note o padrão de saída nos casos de testes.
Exemplos de Entrada e Saída
Entrada	
2 4
Saída	
 |  2  3  4 

2| 04 06 08 
3| 06 09 12 
4| 08 12 16 
Entrada	
2 8
Saída	
 |  2  3  4  5  6  7  8 

2| 04 06 08 10 12 14 16 
3| 06 09 12 15 18 21 24 
4| 08 12 16 20 24 28 32 
5| 10 15 20 25 30 35 40 
6| 12 18 24 30 36 42 48 
7| 14 21 28 35 42 49 56 
8| 16 24 32 40 48 56 64 
 */
package Lista07;

import java.util.Scanner;

public class Tabuada2 {
    private int num1;
	private int num2;
	public void setNum1(int novNum1){
		this.num1=novNum1;
	}
	public int getNum1(){
		return this.num1;
	}
	public void setNum2(int novNum2){
		this.num2=novNum2;
	}
	public int getNum2(){
		return this.num2;
	}
	
	public void tabuadison(){
		int N = this.getNum1();
      int Q = this.getNum2();
		int resultado;
		System.out.print(" |");
		for(int a=N; a<=Q; a++){
			System.out.printf("%3d ", a);
		}
		System.out.println();
		
		
		System.out.println();
		for (int i = N; i <= Q; i++) {
            System.out.printf("%d|", i);
            for (int j = N; j <= Q; j++) {
					resultado=i*j;
					if((resultado)<10){
						System.out.printf(" 0"+resultado+" ");
					}else{
						System.out.printf("%3d ", resultado);
					}
                
            }
            System.out.println();
      }
		System.out.println();
		
	}
	public static void main(String[] args){
		Tabuada2 ast = new Tabuada2();
		Scanner ler = new Scanner(System.in);
		
		int tamTabuada1=ler.nextInt();
		int tamTabuada2=ler.nextInt();
		ast.setNum1(tamTabuada1);
		ast.setNum2(tamTabuada2);
		ast.tabuadison();
	}
}
