/*
 * Enunciado
Tabuada v1
Crie uma classe que tem somente um atributo do tipo inteiro.
Seu programa deve ler um número informado pelo usuário e exibir a sua tabuada de multiplicação personalizada seguindo o exemplo do caso de teste.
Dicas
É obrigatório o uso do comando for.
Observe a saída do caso de teste
Exemplos de Entrada e Saída
Entrada	
1
Saída	
1 x 0 = 0
1 x 1 = 1
 */
package Lista07;

import java.util.Scanner;

public class Tabuada {
    private int numM;
	
	public void setNumM(int novoNumM){
		this.numM=novoNumM;
	}
	public int getNumM(){
		return this.numM;
	}
	public void tabuada(){
		int tempNum=this.getNumM();
		int tabu=0;
		for(int i=0; i<=tempNum; i++){
			tabu=tempNum*i;
			System.out.println(tempNum+" x "+i+" = "+tabu);
		}
	}
	public static void main(String[] args){
		Tabuada calc=new Tabuada();
		Scanner ler=new Scanner(System.in);
		
		int tempM=ler.nextInt();
		
		calc.setNumM(tempM);
		calc.tabuada();
	}
}
