package Lista04;
/*
 * Enunciado
Poder de compra
Você foi contratado por uma loja de roupas que oferece um desconto de 5% para quem faz compras acima de R$ 200,00. Escreva um programa que recebe o valor da compra total e o saldo que o cliente tem, ao final você deve imprimir o valor da compra já com o desconto e se o cliente tem condições de pagar ou não essa compra.

Dicas
Crie uma classe Compra.
Sua classe deverá ter apenas dois atibutos do tipo float.
Faça todos os métodos de acesso/modificação.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
100 20
Saída	
Valor final da compra 100.00, O cliente nao tem saldo suficiente!!
Entrada	
252.99 246
Saída	
Valor final da compra 240.34, O cliente tem saldo suficiente!!
Resultado
 */
import java.util.Scanner;

public class Compra{
	
	private float compraT;
	private float saldoC;
	
	public void setCompraT(float novaCompra){
		this.compraT=novaCompra;
	}
	public float getCompraT(){
		return this.compraT;
	}
	public void setSaldoC(float novoSaldoC){
		this.saldoC=novoSaldoC;
	}
	public float getSaldoC(){
		return this.saldoC;
	}
	
	public void resultadoCompra(){
		float compra=this.getCompraT();
		float saldo=this.getSaldoC();
		
		float resultadoP=(compra*(5.0f/100.0f));
		float resultadoC=((compra)-(resultadoP));
		if(resultadoC>saldo){
			System.out.printf("Valor final da compra %.2f, O cliente nao tem saldo suficiente!!", compra);
		}else{
			System.out.printf("Valor final da compra %.2f, O cliente tem saldo suficiente!!", resultadoC);
		}
	}
	public static void main(String[] args){
		Compra saldo = new Compra();
		Scanner ler=new Scanner(System.in);
		
		float temp1=ler.nextFloat();
		float temp2=ler.nextFloat();
		
		saldo.setCompraT(temp1);
		saldo.setSaldoC(temp2);
		
		saldo.resultadoCompra();
		ler.close();
	}
}
