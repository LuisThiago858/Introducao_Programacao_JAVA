package exercicios_01;
public class Aluno{

	//trabalhanado com Objetos
	private Aluno amigo;
	public void setNomeMelhorAmigo(Aluno NovoAmigo){
		this.amigo=NovoAmigo;
	}

	public Aluno getNomeMelhorAmigo(){
		return this.amigo;
	}
	public void digaONomeDoMelhorAmigo() {
		System.out.println("Meu nome eh "+this.getNome()+" e o nome do meu melhor amigo eh " + this.amigo.getNome());
	}
			
	//Trabalhando com strings
	private String nome;
	public void setNome(String novoNome){
		this.nome=novoNome;
	}
	public String getNome(){
		return this.nome;
	}

	//Traabalhando com numeros
	private Integer num1;
	private Integer num2;

	public void setUmNumero(Integer numero1){
		this.num1=numero1;
	}
	public void setUmNumero2(Integer numero2){
		this.num2=numero2;
	}
	public Integer getRespondaASoma(){
		return this.num1+this.num2;
	}

	//Trabalhando com metodos
	public void digaOi(){
		System.out.println("Ola!!");
	}
	public void digaBomDia(){
		System.out.println("Ola Bom dia");
	}
	public void digaSeuNome(){
		System.out.println("Meu nome é "+this.getNome());
	}
}
