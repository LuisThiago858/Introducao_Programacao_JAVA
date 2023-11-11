package Lista02;
/*
 * Enunciado
Crie uma classe chamada Troca, essa classe deverá ter:

Dois atributos do tipo int.
Os métodos gets/sets.
Um método chamado trocaValores que efetua a troca dos valores de cada atributo do objeto entre sí.
Um método chamado imprimeValores que imprime os valores guardados em nosso objeto.
Dicas
Dados dois números A e B efetue a troca dos seus valores entre ambos.

Qualquer código que não haja a troca efetiva dos valores será cancelado.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
7 4
Saída	
A: 4
B: 7
Resultado
 */
import java.util.Scanner;

public class Troca{
	private int num1;
	private int num2;
	
	public void setNum1(int novoNum1){
		this.num1=novoNum1;
	}
	public int getNum1(){
		return this.num1;
	}
	public void setNum2(int novoNum2){
		this.num2=novoNum2;
	}
	public int getNum2(){
		return this.num2;
	}
	
	public void trocaValores(){
		int temp1=this.getNum1();
		int temp2=this.getNum2();
		int aux;
		
		aux=temp1;
		temp1=temp2;
		temp2=aux;
		
		this.setNum1(temp1);
		this.setNum2(temp2);
	}
	public void imprimeValores(){
		int temp1=this.getNum1();
		int temp2=this.getNum2();
		System.out.println("A: "+temp1);
		System.out.println("B: "+temp2);
	}
	
	public static void main(String[] args){
		Troca num=new Troca();
		Scanner ler=new Scanner(System.in);
		
		int temp1=ler.nextInt();
		num.setNum1(temp1);
		int temp2=ler.nextInt();
		num.setNum2(temp2);
		num.trocaValores();
		num.imprimeValores();

        ler.close();
	}
}
