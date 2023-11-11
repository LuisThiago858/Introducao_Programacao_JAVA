package Lista02;
/*
 * Enunciado
Crie uma classe chamada Numero, essa classe deverá ter:

Um atributo do tipo int.
Os métodos gets/sets.
Um método chamado imprimeAntecessor que imprime o antecessor do número guardado em nosso objeto.
Um método chamado imprimeSucessor que imprime o sucessor do número guardado em nosso objeto.
um método chamado imprimeNumero que imprime o número guardado em nosso objeto.
 

Dicas
Dado um valor inteiro imprima o seu antecessor e seu sucessor.

Leia o enunciado com atenção.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
68
Saída	
Numero: 68
Antecessor: 67
Sucessor: 69
Entrada	
0
Saída	
Numero: 0
Antecessor: -1
Sucessor: 1
Resultado
 */
import java.util.Scanner;

public class Numero{
	private int num1;
	
	public void setNum1(int novoNum1){
		this.num1=novoNum1;
	}
	public int getNum1(){
		return this.num1;
	}
	public void imprimeNumero(){
		int numero=this.getNum1();
		
		System.out.println("Numero: "+numero);
	}
	
	public void imprimeAntecessor(){
		int antecessor=this.getNum1()-1;
		System.out.println("Antecessor: "+antecessor);
	}
	
	public void imprimeSucessor(){
		int sucessor=this.getNum1()+1;
		System.out.println("Sucessor: "+sucessor);
	}
	
	public static void main(String[] args){
		Numero num=new Numero();
		Scanner ler=new Scanner(System.in);
		
		int temp1=ler.nextInt();
		num.setNum1(temp1);
		
		num.imprimeNumero();
		num.imprimeAntecessor();
		num.imprimeSucessor();

        ler.close();
	}
}
