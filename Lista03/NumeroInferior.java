package Lista03;
/*
 * Enunciado
Maior número
Sua missão nesse exercício é que dado dois números inteiros, você deve informar ao usuário qual deles é o maior por meio da seguinte frase: "Numero y eh inferior ao numero x", onde x e y são os número informados pelo usuário.

Dicas
Você é livre para escolher o nome da classe.
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Nunca haverá dois números iguais.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
3 2
Saída	
Numero 2 eh inferior ao numero 3
Entrada	
1000 5000
Saída	
Numero 1000 eh inferior ao numero 5000
Resultado
 */
import java.util.Scanner;
public class NumeroInferior{
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
	
	public void inferior(){
		int temp1=this.getNum1();
		int temp2=this.getNum2();
		
		if(temp1<temp2){
			System.out.println("Numero "+temp1+" eh inferior ao numero "+temp2);
		}
		if(temp1>temp2){
			System.out.println("Numero "+temp2+" eh inferior ao numero "+temp1);
		}
	}
	
	public static void main(String[] args){
		NumeroInferior numInferior=new NumeroInferior();
		Scanner ler=new Scanner(System.in);
		
		int temp1;
		int temp2;
		temp1=ler.nextInt();
		temp2=ler.nextInt();
		numInferior.setNum1(temp1);
		numInferior.setNum2(temp2);
		
		numInferior.inferior();
        ler.close();
	}
		
}
