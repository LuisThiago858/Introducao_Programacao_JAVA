package Lista05;
/*
 * Enunciado
"Viagem em família"

Uma família está viajando de carro de Porto Alegre até a cidade de Gramado para passar suas férias de fim de ano. Sua missão é verificar se o carro que está sendo usado na viagem é não é econômico, econômico ou super econômico.




Dicas
Todos os atributos são do tipo float.
Crie uma classe chamada Carro.
Sua classe deverá ter os seguintes atributos distancia em quilômetros e quantidade de litros de gasolina, ambos consumidos pelo carro durante o percurso.
Crie um método que calcule o consumo em Km/L do carro da família e imprima uma mensagem de acordo com a tabela abaixo:
Consumo	Km/L	Mensagem
menor que	8	Venda o carro!
entre	8 e 14	Economico!
maior	14	Super Economico!
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
113
39
Saída	
Venda o carro!
Resultado
 */
import java.util.Scanner;

public class Carro{
	private float distaKm;
	private float quantLG;
	
	public float getDistaKm(){
		return this.distaKm;
	}
	public void setDistaKm(float novaDistaKm){
		this.distaKm=novaDistaKm;
	}
	
	public float getQuantLG(){
		return this.quantLG;
	}
	public void setQuantLG(float novaQuantLG){
		this.quantLG=novaQuantLG;
	}
	
	public void consumoKmL(){
		float distancia=this.getDistaKm();
		float gasolina=this.getQuantLG();
		
		float consumo=(distancia)/(gasolina);
		
		if(consumo<8.0f){
			System.out.println("Venda o carro!");
		}else if((consumo>=8.0f)&&(consumo<=14.0f)){
			System.out.println("Economico!");
		}else if(consumo>14.0f){
			System.out.println("Super Economico!");
		}
	}
	
	public static void main(String[] args){
		Carro carro01=new Carro();
		Scanner ler=new Scanner(System.in);
		
		float tempD=ler.nextFloat();
		float tempG=ler.nextFloat();
		
		carro01.setDistaKm(tempD);
		carro01.setQuantLG(tempG);
		carro01.consumoKmL();
        ler.close();
	}
}
