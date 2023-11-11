/*
 * Enunciado
Brincando com loops v4
Crie uma classe que contém somente um atributo do tipo inteiro.
Sua missão é detectar um padrão que dado um valor N, você deverá escrever uma função que desenhe uma pirâmide.
Dicas
É obrigatório o uso do comando for.
A pirâmide é composta por asteriscos "empilhados". No primeiro nível há um único asterisco, no segundo nível há três e assim por diante.
Fique atento aos casos de teste
Exemplos de Entrada e Saída
Entrada	
2
Saída	
.*.
***
Entrada	
5
Saída	
....*....
...***...
..*****..
.*******.
*********
 */
package Lista07;

import java.util.Scanner;

public class Piramide {
    private int num;
	public void setNum(int novNum){
		this.num=novNum;
	}
	public int getNum(){
		return this.num;
	}
	
	public void piramideHead(){
		int tempTam=this.getNum();
		for(int i=1; i<=tempTam; i++){
			for(int a=1; a<=tempTam-i; a++){
				System.out.print(".");
			}
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			for(int k=1; k<=tempTam-i; k++){
				System.out.print(".");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Piramide ast = new Piramide();
		Scanner ler = new Scanner(System.in);
		
		int tamPiramide=ler.nextInt();
		ast.setNum(tamPiramide);
		ast.piramideHead();
	}
}
