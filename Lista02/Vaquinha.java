package Lista02;
/*
 * Enunciado
Um grupo de 5 amigos resolveu fazer um grande pedido de salgados, porém um dos amigos está sem nenhum dinheiro no bolso e não pode cooperar.

Crie uma classe chamada Vaquinha, essa classe deverá ter:

Um atributos do tipo float.
Os métodos gets/sets.
Um método chamado imprimeValor que imprime o valor que cada um dos amigos vai ter que gastar para pagar a conta.
Dicas
Use a máscara ("%.2f") no método de impressão.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
542
Saída	
135.50
Resultado
 */
import java.util.Scanner;

public class Vaquinha{
	private float num1;
	
	public void setNum1(float novoNum1){
		this.num1=novoNum1;
	}
	public float getNum1(){
		return this.num1;
	}
	
	public void imprimeValor(){
		float temp1=this.getNum1();
		
		
		float quantoPagar=(temp1)/4;
		
		System.out.printf("%.2f",quantoPagar);
	}
	
	public static void main(String[] args){
		Vaquinha num=new Vaquinha();
		Scanner ler=new Scanner(System.in);
		
		float temp1=ler.nextFloat();
		
		num.setNum1(temp1);

		
		num.imprimeValor();
        ler.close();
	}
}
