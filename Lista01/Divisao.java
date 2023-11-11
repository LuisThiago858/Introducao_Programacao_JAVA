package Lista01;
/*
 * Enunciado
Crie uma classe chamada Divisao, essa classe deverá ter:

Dois atributos do tipo float.
Os métodos gets/sets.
Um método chamado imprimeDivisao que imprime o resultado da operação de divisao entre dois números.
 

 

 

Dicas
Os dados deverão ser de tipo flutuante.

formate a saída para exibir até 3 casas decimais.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
5 2
Saída	
O resultado da divisao eh: 2.500
Entrada	
1 0.3
Saída	
O resultado da divisao eh: 3.333
Resultado
 */
import java.util.Scanner;

public class Divisao{
	private float num1;
	private float num2;
	
	public void setNum1(float novoNum1){
		this.num1=novoNum1;
	}
	public float getNum1(){
		return this.num1;
	}
	public void setNum2(float novoNum2){
		this.num2=novoNum2;
	}
	public float getNum2(){
		return this.num2;
	}
	
	public void imprimeDivisao(){
		float temp1=this.getNum1();
		float temp2=this.getNum2();
		
		float resultado=(temp1)/(temp2);
		
		System.out.printf("O resultado da divisao eh: %.3f\n", resultado);
	}
	
	public static void main(String[] args){
		Divisao num=new Divisao();
		Scanner ler=new Scanner(System.in);
		
		float temp1=ler.nextFloat();
		float temp2=ler.nextFloat();
		
		num.setNum1(temp1);
		num.setNum2(temp2);
		
		num.imprimeDivisao();
        ler.close();
	}
}
