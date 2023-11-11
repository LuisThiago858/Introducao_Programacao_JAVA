package Lista03;
/*
 * Enunciado
Simplesmente positivo
Sua missão é simples, seu coleguinha é novo no curso de computação e não está conseguindo verificar se um número é positivo, ajude-o nessa tarefa e como recompensa ele sempre será grato a você. Se o número for positivo o programa deve informar ao usuário por meio da seguinte frase: "Numero x eh super positivo", onde x é um número informado por ele.

Dicas
O nome da classe deve ser Positivo.
Observe os casos de teste.
Ao final do programa deve ser exibida a seguinte mensagem: "Exiting..."
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
8
Saída	
Numero 8 eh super positivo
Exiting...
Entrada	
-6
Saída	
Exiting...
Resultado

 */
import java.util.Scanner;

public class Positivo{
	private int num;
	
	public void setNum(int novoNum){
		this.num=novoNum;
	}
	public int getNum(){
		return this.num;
	}
	
	public void ehPositivo(){
		int temp=this.getNum();
		
		if(temp>0){
			System.out.println("Numero "+temp+" eh super positivo");
			System.out.println("Exiting...");
		}else{
			System.out.println("Exiting...");
		}
	}
	
	public static void main(String[] args){
		Positivo numero=new Positivo();
		Scanner ler=new Scanner(System.in);
		
		int temp;
		temp=ler.nextInt();
		numero.setNum(temp);
		numero.ehPositivo();

        ler.close();
	}
}
