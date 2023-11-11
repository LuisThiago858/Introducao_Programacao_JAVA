package Lista01;
/*
 * Enunciado
Crie uma classe chamada Multiplica, essa classe deverá ter:

Dois atributos do tipo float.
Os métodos gets/sets.
Um método chamado imprimeMultiplicacao que imprime o resultado da operação de multiplicação entre números.
 

 

 

Dicas
Os dados serão do tipo flutuante.

Formate a saída do resultado seguindo esse padrão:

System.out.printf("O resultado da multiplicacao eh: %.0f\n", resultado);]
Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
5 6
Saída	
O resultado da multiplicacao eh: 30
Entrada	
4.6 8
Saída	
O resultado da multiplicacao eh: 37
Entrada	
-1.5 2.6
Saída	
O resultado da multiplicacao eh: -4
Resultado

 */
import java.util.Scanner;

public class Multiplica{
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
	
	public void imprimeMultiplicacao(){
		float temp1=this.getNum1();
		float temp2=this.getNum2();
		
		float resultado=(temp1)*(temp2);
		
		System.out.printf("O resultado da multiplicacao eh: %.0f\n", resultado);
	}
	
	public static void main(String[] args){
		Multiplica num=new Multiplica();
		Scanner ler=new Scanner(System.in);
		
		float temp1=ler.nextFloat();
		float temp2=ler.nextFloat();
		
		num.setNum1(temp1);
		num.setNum2(temp2);
		
		num.imprimeMultiplicacao();
        ler.close();
	}
}
