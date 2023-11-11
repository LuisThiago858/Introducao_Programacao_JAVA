package Lista03;
/*
 * Enunciado
Menor número
Sua missão nesse exercício é que dado dois números inteiros, você deve informar ao usuário qual deles é o menor por meio da seguinte frase: "Numero x eh menor que y", onde x e y são os número informados pelo usuário.

Dicas
Você é livre para escolher o nome da classe.
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Nunca haverá dois números iguais.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
1 2
Saída	
Numero 1 eh menor que 2
Entrada	
9 0
Saída	
Numero 0 eh menor que 9
Resultado
 */
import java.util.Scanner;
public class Numeros{
	private int num1;
	private int num2;
	
	public int getNum1(){
		return this.num1;
	}
	public void setNum1(int novoNum1){
		this.num1=novoNum1;
	}
	
	public int getNum2(){
		return this.num2;
	}
	public void setNum2(int novoNum2){
		this.num2=novoNum2;
	}
	
	public void menor(){
		int num1=this.getNum1();
		int num2=this.getNum2();
		if(num1<num2){	
			System.out.println("Numero "+num1+ " eh menor que "+num2);
		}
		if(num1>num2){
			System.out.println("Numero "+num2+" eh menor que " +num1);
		}
	}
	public static void main(String[] args){
		Numeros comparacao=new Numeros();
		Scanner ler=new Scanner(System.in);
		
		int temp1;
		int temp2;
		
		temp1=ler.nextInt();
		temp2=ler.nextInt();
		comparacao.setNum1(temp1);
		comparacao.setNum2(temp2);
		comparacao.menor();

        ler.close();
	}	
}
