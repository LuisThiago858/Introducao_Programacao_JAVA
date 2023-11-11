/*
 * Enunciado
Fatorial
Crie uma classe que deverá ter somente um atributo.
Seu programa deve calcular o fatorial de um número fornecido pelo usuário.
Ex:

5!=120.

Dicas
É obrigatório o uso do comando for.
Exemplos de Entrada e Saída
Entrada	
2
Saída	
Fatorial de 2: 2
 */
package Lista07;

import java.util.Scanner;

public class Fatorial {
    private int num;
	
	public void setNum(int novoNum){
		this.num=novoNum;
	}
	public int getNum(){
		return this.num;
	}
	public void fatorial(){
		int tempFat=this.getNum();
		int auxFat=1;
		for(int i=1; i<=tempFat; i++){
			auxFat=auxFat*i;
		}
		System.out.println("Fatorial de "+tempFat+": "+auxFat);
	}
	public static void main(String[] args){
		Fatorial numero = new Fatorial();
		Scanner ler = new Scanner(System.in);
		
		int temp=ler.nextInt();
		numero.setNum(temp);
		numero.fatorial();
		
	}
}
