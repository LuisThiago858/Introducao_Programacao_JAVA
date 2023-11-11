package Lista03;
/*
 * Enunciado
Simplesmente negativo
Após ajudar seu amiguinho, ele pediu novamente sua ajuda, para acabar logo com toda essa tarefa você precisa desenvolver um programa que simplemente verifica se um número é negativo. Se o número for negativo o programa deve informar ao usuário por meio da seguinte frase: "Numero x nao eh super positivo", onde x é um número informado por ele.

Dicas
O nome da classe deve ser Negativo.
Observe os casos de teste.
Ao final do programa deve ser exibida a seguinte mensagem: "Exiting..."
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
-5
Saída	
Numero -5 nao eh super positivo
Exiting...
Resultado
 */
import java.util.Scanner;

public class Negativo{
	private int num;
	
	public void setNum(int novoNum){
		this.num=novoNum;
	}
	public int getNum(){
		return this.num;
	}
	
	public void ehNegativo(){
		int temp=this.getNum();
		
		if(temp<0){
			System.out.println("Numero "+temp+" nao eh super positivo");
			System.out.println("Exiting...");
		}else{
			System.out.println("Exiting...");
		}
	}
	
	public static void main(String[] args){
		Negativo num=new Negativo();
		Scanner ler=new Scanner(System.in);
		
		int temp;
		temp=ler.nextInt();
		num.setNum(temp);
		num.ehNegativo();
        ler.close();
	}
}
