/*
 * Enunciado
Fibonacci recursivo
A sequência de fibonacci é uma parte famosa da matemática e, por acaso, tem uma definição recursiva. Os primeiros dois valores na sequência são 0 e 1 (essencialmente 2 casos básicos). Cada valor subsequente é a soma dos dois valores anteriores, portanto, a sequência inteira é: 0, 1, 1, 2, 3, 5, 8, 13, 21 e assim por diante.

Crie uma classe chamada Fibonacci.
Sua classe só deve ter um atributo do tipo int.
Crie os métodos gets/sets.
Crie um método chamado fibo que recebe por parâmetro um inteiro n e retorna o valor do fibonacci nesse índice dado, o retorno dessa função deve ser salva no seu objeto e impressa logo em seguida.
 

Exemplos de Entrada e Saída
Entrada	
5
Saída	
5
 */
package Lista10;

import java.util.Scanner;

public class Fibonacci{
	private int num;
	
	public void setNum(int novoNum){
		this.num=novoNum;
	}
	public int getNum(){
		return this.num;
	}
	
	public int fibo(int n){
		int resp;
		if(n<=1){
			resp=n;
		}else{
			resp=fibo(n-1)+fibo(n-2);
		}
		return resp;
	}
	
	public static void main(String[] args){
		Fibonacci fib = new Fibonacci();
		Scanner ler = new Scanner(System.in);
		int n=ler.nextInt();
		int resultado=fib.fibo(n);
		System.out.println(resultado);
		ler.close();
	}
}
