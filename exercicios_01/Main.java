package exercicios_01;
public class Main{
	public static void main(String[] args){
		System.out.println("teste do objeto");

		Aluno aluno01;
		Aluno aluno02;

		aluno01=new Aluno();
		aluno02= new Aluno();

		aluno01.digaOi();
		aluno01.digaBomDia();
		aluno01.setNome("Oppenheimer");
		aluno01.digaSeuNome();
		aluno01.setUmNumero(5);
		aluno01.setUmNumero2(6);
		int resultado01 = aluno01.getRespondaASoma();
		System.out.println("O resultado é "+ resultado01);

		aluno02.digaOi();
		aluno02.digaBomDia();
		aluno02.setNome("Ken");
		aluno02.digaSeuNome();
		aluno02.setUmNumero(2);
		aluno02.setUmNumero2(3);
		int resultado02 = aluno02.getRespondaASoma();
		System.out.println("O resultado é "+resultado02);

		aluno02.setNomeMelhorAmigo(aluno01);
		aluno02.digaONomeDoMelhorAmigo();
		aluno01.setNomeMelhorAmigo(aluno02);
		aluno01.digaONomeDoMelhorAmigo();
	}
}
