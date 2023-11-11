package Lista03;
/*
 * Enunciado
Somar algarismos ?
Sua colega gosta de somar os algarismos de um número, porém tem uma regra ela só realiza essa soma se o número não for ímpar, sua missão é desenvolver um programa que primeiro verifica se um número é par, caso seja realize a soma dos seus algarismos e ao final informe esse valor ao usuário com a seguinte mensagem:

"Numero x eh par e a soma dos seus algarismos eh y", onde x é um número informado pelo usuário e y a soma dos algarismos.

Dicas
O nome da classe deve ser Algarismos.
Observe os casos de teste.
Ao final do programa deve ser exibida a seguinte mensagem: "Bye Bye".
O número sempre terá 3 algarismos.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
333
Saída	
Bye Bye
Resultado

 */
import java.util.Scanner;

public class Algarismos{
	private int num;
	
	public void setNum(int novoNum){
		this.num=novoNum;
	}
	public int getNum(){
		return this.num;
	}
	
	public void somaAlgarismos(){
		int temp=this.getNum();
		int soma;
		if(temp%2==0){
			int aux1=temp/100; //primeiro digito
			int aux2=(temp/10)%10; //segundo digito
			int aux3=temp%10; //terceiro digito
			soma=aux1+aux2+aux3;
			System.out.println("Numero "+temp+" eh par e a soma dos seus algarismos eh "+soma);
			System.out.println("Bye Bye");
		}else{
			System.out.println("Bye Bye");
		}
	}
	public static void main(String[] args){
		Algarismos num=new Algarismos();
		Scanner ler=new Scanner(System.in);
		
		int temp=ler.nextInt();
		num.setNum(temp);
		num.somaAlgarismos();
		ler.close();
	}
}
