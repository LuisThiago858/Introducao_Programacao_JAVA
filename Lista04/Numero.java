package Lista04;
/*
 * Enunciado
Ordem decrescente
Sua colega maria está com dificuldades em uma tafera de matemática onde dados 3 números ela deve colocá-los em ordem decrescente, como você manja muito de programação resolveu ajudá-la. O programa inicia e o usuário informa os 3 números ao final seu programa deve imprimir todos os números em ordem decrescente.

Dicas
A classe deve se chamar Numero.
Sua classe deve ter somente um atributo do tipo int.
Crie um método chamado ordemDecrescente(Numero num1, Numero num2), que imprime os números em ordem decrescente.
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
3 1 2
Saída	
3 2 1
Entrada	
4 1 4
Saída	
4 4 1
Resultado
 */
import java.util.Scanner;

public class Numero{
	private int num1;
	private int num2;
	private int num3;
	
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
	
	public void ordemDecrescente(){
		int tempNum1=this.getNum1();
		int tempNum2=this.getNum2();
		int tempNum3=this.getNum3();
		
		if(tempNum1<tempNum2){
			int temp=tempNum1;
			tempNum1=tempNum2;
			tempNum2=temp;
		}
		if(tempNum2<tempNum3){
			int temp=tempNum2;
			tempNum2=tempNum3;
			tempNum3=temp;
		}
		if(tempNum1<tempNum2){
			int temp=tempNum1;
			tempNum1=tempNum2;
			tempNum2=temp;
		}
		System.out.println(tempNum1+" "+tempNum2+" "+tempNum3);
	}
	
	public static void main(String[] args){
		Numero troca = new Numero();
		Scanner ler = new Scanner(System.in);
		
		int temp1=ler.nextInt();
		int temp2=ler.nextInt();
		int temp3=ler.nextInt();
		troca.setNum1(temp1);
		troca.setNum2(temp2);
		troca.setNum3(temp3);
		troca.ordemDecrescente();
        ler.close();
	}
}
