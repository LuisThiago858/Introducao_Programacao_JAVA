package Lista03;
/*
 * Enunciado
Resposta do universo
Sua missão nesse exercício é verificar se a soma de dois valores passados pelo usuário se trata do número que contem um grande enigma por trás, sim trata-se do número 42. Caso a soma dos valores informados for igual a esse número, informe ao usuário que ele está dentro do enigma por meio da seguinte frase: "A soma de x e y eh equivalente ao enigma do universo 42", onde x e y são os números informado por ele.

Dicas
O nome da classe deve ser Enigma.
Observe os casos de teste.
Ao final do programa deve ser exibida a seguinte mensagem: "System Down"
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
1 2
Saída	
System Down
Resultado
 */
import java.util.Scanner;

public class Enigma{
	private int num1;
	private int num2;
	
	public void setNum1(int novoNum1){
		this.num1=novoNum1;
	}
	public int getNum1(){
		return this.num1;
	}
	
	public int getNum2(){
		return this.num2;
	}
	public void setNum2(int novoNum2){
		this.num2=novoNum2;
	}
	
	public void enigma(){
		int temp1=this.getNum1();
		int temp2=this.getNum2();
		int soma=temp1+temp2;
		if(soma==42){
			System.out.println("A soma de "+temp1+" e "+temp2+" eh equivalente ao enigma do universo 42");
			System.out.println("System Down");
		}else{
			System.out.println("System Down");
		}
	}
	
	public static void main(String[] args){
		Enigma charada=new Enigma();
		Scanner ler = new Scanner(System.in);
		int temp1;
		int temp2;
		temp1=ler.nextInt();
		temp2=ler.nextInt();
		charada.setNum1(temp1);
		charada.setNum2(temp2);
		charada.enigma();
        ler.close();
	}
}
