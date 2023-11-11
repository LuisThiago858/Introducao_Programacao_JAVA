/*
 * Enunciado
Brincando com triângulo
Temos um triângulo feito de blocos. A linha superior tem 1 bloco, a próxima linha abaixo tem 2 blocos, a próxima linha tem 3 blocos e assim por diante. Calcule recursivamente o número total de blocos em tal triângulo com um dado número de linhas.

Crie uma classe chamada Triangulo.
Sua classe só deve ter um atributo do tipo int.
Crie os métodos gets/sets.
Crie um método chamado contaBlocos que recebe por parâmetro um inteiro n referente ao número de linhas de um triângulo e retorna o número total de blocos do triângulo, o retorno dessa função deve ser salva no seu objeto e impressa logo em seguida.
 

 

Exemplos de Entrada e Saída
Entrada	
2
Saída	
3
 */
package Lista10;

import java.util.Scanner;

public class Triangulo{
	private int num;
	
	public void setNum(int novoNum){
		this.num=novoNum;
	}
	public int getNum(){
		return this.num;
	}
	
	public int contaBlocos(int linha){
		int resultado;
		if(linha==1){
			resultado=1;
		}else{
			resultado = linha+contaBlocos(linha-1);	
			System.out.println(resultado);
		}
		return resultado;
	}
	
	public static void main(String[] args){
		Triangulo tri=new Triangulo();
		Scanner ler = new Scanner(System.in);
		int n=ler.nextInt();
		tri.contaBlocos(n);	
        ler.close();
	}
}
