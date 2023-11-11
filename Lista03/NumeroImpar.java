package Lista03;
/*
 * Enunciado
Número ímpar
Sua missão nesse exercício é verificar se um valor passado pelo usuário se trata de um número ímpar. Se for ímpar deve informar ao usuário por meio da seguinte frase: "Numero x não eh par", onde x é um número informado por ele.

Dicas
O nome da classe deve ser NumeroImpar.
Observe os casos de teste.
Ao final do programa deve ser exibida a seguinte mensagem: "F1m d0 Pr0gr4m4"
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
9
Saída	
Numero 9 nao eh par
F1m d0 Pr0gr4m4
Resultado
 */

import java.util.Scanner;

public class NumeroImpar{
	private int num;
	
	public int getNum(){
		return this.num;
	}
	public void setNum(int novoNum){
		this.num=novoNum;
	}
	
	public void naoPar(){
		int temp=this.getNum();
		if(!(temp%2==0)){
			System.out.println("Numero "+temp+" nao eh par");
			System.out.println("F1m d0 Pr0gr4m4");
		}else{
			System.out.println("F1m d0 Pr0gr4m4");
		}
	}
	public static void main(String[] args){
		NumeroImpar num=new NumeroImpar();
		Scanner ler=new Scanner(System.in);
		
		int temp;
		temp=ler.nextInt();
		num.setNum(temp);
		num.naoPar();
        ler.close();
	}
}
