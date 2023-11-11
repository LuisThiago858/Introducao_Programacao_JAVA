package Lista01;
/*
 * Enunciado
Crie uma classe chamada Media, essa classe deverá ter:

Quatro atributos do tipo float.
Os métodos gets/sets.
Um método chamado imprimeMedia que imprime a média das quatro notas.
Dicas
Todos os dados serão pontos flutuantes.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
5 7 8 9
Saída	
A media das notas eh: 7.25
Entrada	
5.26 7.6 4 9.9
Saída	
A media das notas eh: 6.69
Resultado
 */
import java.util.Scanner;

public class Media{
	private float num1;
	private float num2;
	private float num3;
	private float num4;
	
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
	public void setNum3(float novoNum3){
		this.num3=novoNum3;
	}
	public float getNum3(){
		return this.num3;
	}
	public void setNum4(float novoNum4){
		this.num4=novoNum4;
	}
	public float getNum4(){
		return this.num4;
	}
	
	public void imprimeMedia(){
		float temp1=this.getNum1();
		float temp2=this.getNum2();
		float temp3=this.getNum3();
		float temp4=this.getNum4();
		
		float media=((temp1)+(temp2)+(temp3)+(temp4))/4.0f;
		
		System.out.printf("A media das notas eh: %.2f\n", media);
	}
	
	public static void main(String[] args){
		Media num=new Media();
		Scanner ler=new Scanner(System.in);
		
		float temp1=ler.nextFloat();
		float temp2=ler.nextFloat();
		float temp3=ler.nextFloat();
		float temp4=ler.nextFloat();
		
		num.setNum1(temp1);
		num.setNum2(temp2);
		num.setNum3(temp3);
		num.setNum4(temp4);
		
		num.imprimeMedia();
		ler.close();
	}
}
