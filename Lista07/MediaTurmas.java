/*
 * Enunciado
Média das turmas
Crie uma classe que contenha somente um atributo do tipo inteiro.
Seu programa deve ler a quantidade de turmas de um professor, a quantidade de alunos em cada turma(esse valor pode ser diferente em cada turma) e as notas dos alunos de cada turma, ao final imprima a média das notas por turma.
Dicas
É obrigatório o uso do comando for.
Seu atributo é referente a quantidade de turmas do professor.
Exemplos de Entrada e Saída
Entrada	
1
4
5 9 10 4
Saída	
Media da turma 1 = 7.00
Entrada	
2
3
3 4 6
2
9 8
Saída	
Media da turma 1 = 4.33
Media da turma 2 = 8.50
 */
package Lista07;

public class MediaTurmas {
    import java.util.Scanner;


public class MediaTurmas {
    private int quantTurmas;

    public void setQuantTurmas(int novaQuantTurmas) {
        this.quantTurmas = novaQuantTurmas;
    }

    public int getQuantTurmas() {
        return this.quantTurmas;
    }

    public float calcularMedia(float[] notas) {
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void calcularMediasDasTurmas() {
        Scanner ler = new Scanner(System.in);

        for (int turma = 1; turma <= this.getQuantTurmas(); turma++) {
            int numAlunos = ler.nextInt();
            float[] notas = new float[numAlunos];

            for (int aluno = 0; aluno < numAlunos; aluno++) {
                notas[aluno] = ler.nextFloat();
            }

            float media = calcularMedia(notas);
            System.out.printf("Media da turma %d = %.2f%n", turma, media);
        }
    }

    public static void main(String[] args) {
        MediaTurmas sistema = new MediaTurmas();
        Scanner ler = new Scanner(System.in);
        int turmas = ler.nextInt();
        sistema.setQuantTurmas(turmas);
        sistema.calcularMediasDasTurmas();
    }
}


public class Media1{
	private int quantTurmas;
	
	public void setQuantTurmas(int novaQuantTurmas){
		this.quantTurmas=novaQuantTurmas;
	}
	public int getQuantTurmas(){
		return this.quantTurmas;
	}
	public void mediaDaTurma(){
		 Scanner ler = new Scanner(System.in);
        
       for (int i = 1; i <= this.getQuantTurmas(); i++) {
            int alunos = ler.nextInt();
            float mediaDaTurma = 0.0f;
            
            for (int j = 1; j <= alunos; j++) {
                float notasAlunos = ler.nextFloat();
                mediaDaTurma += notasAlunos;
            }
            float media = mediaDaTurma / alunos;
            System.out.printf("Media da turma %d = %.2f\n", i, media);
        }
	}
	public static void main(String[] args){
		Media1 sistem = new Media1();
		Scanner ler = new Scanner(System.in);
		int turmas=ler.nextInt();
		sistem.setQuantTurmas(turmas);
		sistem.mediaDaTurma();
	}
}
}
