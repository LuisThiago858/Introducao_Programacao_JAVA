package Lista03;
/*
 * Enunciado
Múltiplos
Sua última missão é verificar se dois números são múltiplos entre sí, crie um programa que realize essa tarefa, porém, você deve primeiro verificar qual é o maior número entre os dois e ao final caso os números sejam múltiplos informe ao usuário por meio da seguinte frase: "Numero x eh multiplo de y", onde x e y são números informados pelo usuário.

Dicas
O nome da classe deve ser Multiplos.
Observe os casos de teste.
Ao final do programa deve ser exibida a seguinte mensagem: "The last mission is over".
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
8 6
Saída	
The last mission is over
Resultado
 */
import java.util.Scanner;

public class Multiplos{
	private int num1;
	private int num2;
	
	public void setNum1(int novoNum1){
		this.num1=novoNum1;
	}
	public void setNum2(int novoNum2){
		this.num2=novoNum2;
	}
	
	public int getNum1(){
		return this.num1;
	}
	public int getNum2(){
		return this.num2;
	}
	
	public void multiplos(){
		int temp1=this.getNum1();
		int temp2=this.getNum2();
		if(temp1>temp2){
			if(temp1%temp2==0) {
        		System.out.println("Numero "+temp1+" eh multiplo de "+temp2);
    		}else{
        		System.out.println("The last mission is over");
    		}
		}
		if(temp2>temp1){
			if(temp2%temp1==0) {
        		System.out.println("Numero "+temp2+" eh multiplo de "+temp1);
    		}else{
        		System.out.println("The last mission is over");
    		}
		}
	}
	
	public static void main(String[] args){
		Multiplos num=new Multiplos();
		Scanner ler=new Scanner(System.in);
		
		int temp1=ler.nextInt();
		int temp2=ler.nextInt();
		
		num.setNum1(temp1);
		num.setNum2(temp2);
		
		num.multiplos();
        ler.close();
	}
}
