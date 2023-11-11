package Lista03;
/*
 * Enunciado
Número par
Sua missão nesse exercício é verificar se um valor passado pelo usuário se trata de um número par. Se for par deve informar ao usuário por meio da seguinte frase: "Numero x eh par", onde x é um número informado por ele.

Dicas
O nome da classe deve ser NumeroPar.
Observe os casos de teste.
Ao final do programa deve ser exibida a seguinte mensagem: "F1m d0 Program4"
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
6
Saída	
Numero 6 eh par
F1m d0 Program4
Entrada	
3
Saída	
F1m d0 Program4
Resultado
 */
import java.util.Scanner;

public class NumeroPar{
	private int num;
	public void setNum(int novoNum){
		this.num=novoNum;
	}
	public int getNum(){
		return this.num;
	}
	
	public void ehPar(){
		int temp=this.getNum();
		if(temp%2==0){
			System.out.println("Numero "+temp+" eh par");
			System.out.println("F1m d0 Program4");
		}
		else{
			System.out.println("F1m d0 Program4");
		}
	}
	public static void main(String[] args){
		NumeroPar num = new NumeroPar();
		Scanner ler = new Scanner(System.in);
		int temp;
		temp=ler.nextInt();
		num.setNum(temp);
		num.ehPar();
        ler.close();
	}
}
