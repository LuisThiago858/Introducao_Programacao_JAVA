package Lista01;
/*
 * Enunciado
Crie uma classe chamada Operacoes, essa classe deverá ter:

Quatro atributos do tipo int.
Os métodos gets/sets.
Um método chamado imprimeResultado que dados quatros números a, b, c, d realize a operação de multiplicação entre os números a e b, subtração entre os números c e d, e no final imprima o resultado da adição de ambos.
Dicas
Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
7 2 6 2
Saída	
18
Entrada	
-8 4 7 -9
Saída	
-16
Resultado
 */
import java.util.Scanner;

public class Operacoes{
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	
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
	public void setNum3(int novoNum3){
		this.num3=novoNum3;
	}
	public int getNum3(){
		return this.num3;
	}
	public void setNum4(int novoNum4){
		this.num4=novoNum4;
	}
	public int getNum4(){
		return this.num4;
	}
	
	public void imprimeResultado(){
		int temp1=this.getNum1();
		int temp2=this.getNum2();
		int temp3=this.getNum3();
		int temp4=this.getNum4();
		
		int multiplicao=(temp1)*(temp2);
		int subtracao=(temp3)-(temp4);
		int resultado=(multiplicao)+(subtracao);
		
		System.out.println(""+ resultado);
	}
	
	public static void main(String[] args){
		Operacoes num=new Operacoes();
		Scanner ler=new Scanner(System.in);
		
		int temp1=ler.nextInt();
		int temp2=ler.nextInt();
		int temp3=ler.nextInt();
		int temp4=ler.nextInt();
		
		num.setNum1(temp1);
		num.setNum2(temp2);
		num.setNum3(temp3);
		num.setNum4(temp4);
		
		num.imprimeResultado();

        ler.close();
	}
}
