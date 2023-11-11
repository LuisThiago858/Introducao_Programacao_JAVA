package Lista01;

/*
 * Enunciado
Crie uma classe chamada Adicao, essa classe deverá ter:

Dois atributos do tipo int.
Os métodos gets/sets.
Um método chamado imprimeResultado que imprime o resultado da operação de adição entre dois números.
 

 

Dicas
A impressão deverá seguir o seguinte padrão:

O resultado da adicao eh: resultado
Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
8 2
Saída	
O resultado da adicao eh: 10
Entrada	
-7 5
Saída	
O resultado da adicao eh: -2
 */
import java.util.Scanner;

public class Adicao{
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
	
	public void imprimeResultado(){
		int temp1=this.getNum1();
		int temp2=this.getNum2();
		
		int soma=(temp1)+(temp2);
		
		System.out.println("O resultado da adicao eh: "+soma);
	}
	
	public static void main(String[] args){
		Adicao num=new Adicao();
		Scanner ler=new Scanner(System.in);
		
		int temp1=ler.nextInt();
		int temp2=ler.nextInt();
		
		num.setNum1(temp1);
		num.setNum2(temp2);
		
		num.imprimeResultado();
		ler.close();
	}
}
