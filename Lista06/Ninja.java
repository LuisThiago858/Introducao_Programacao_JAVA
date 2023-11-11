/*
 * Enunciado
O Kage Bunshin no Jutsu (ou a "técnica dos clones de sombra", para os lusofalantes) é uma técnica milenar bastante utilizada em batalhas ninja.

Quando utilizada, a técnica cria uma cópia idêntica de seu usuário. Desta forma, se um dado ninja usa a técnica, passam a existir dois destes ninjas (o original e a cópia).

A técnica sempre é executada por todos os ninjas existentes no momento. Desta forma, se a técnica for utilizada novamente, passam a existir quatro ninjas idênticos ao original (os dois anteriores e mais duas cópias), e assim por diante.

Há N cópias de um dado ninja (incluindo o original). Sua tarefa é determinar quantas vezes a técnica foi utilizada.

 

Crie a classe Ninja com o atributo copias, junto dos seus método de acesso e modificação (gets e sets).
Crie também o método quantidadeDeUso() que retorna quantas vezes a técnica foi utilizada.
Dicas
Entrada
A entrada contém vários casos de teste. Cada caso contém uma linha com o número N (1 ≤ N ≤ 106). É garantido que o valor de N é tal que é possível obter exatamente N cópias de um ninja utilizando a técnica (incluindo o original).

A leitura termina quando o valor zero (0) for digitado.

Saída
Para cada caso de teste, imprima uma linha contendo o número de vezes que a técnica foi utilizada.

Exemplos de Entrada e Saída
Entrada	
1
2
4
0
Saída	
0
1
2
Entrada	
8
256
64
128
0
Saída	
3
8
6
7
 */

package Lista06;

public class Ninja {
    private int copias;

    public Ninja() {
        this.copias = 1; // Inicialmente, há uma cópia (o original).
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int quantidadeDeUso() {
        int vezesUtilizada = 0;
        int copiasTemporarias = 1;

        while (copiasTemporarias < copias) {
            copiasTemporarias *= 2;
            vezesUtilizada++;
        }

        return vezesUtilizada;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            if (N == 0) {
                break;
            }

            Ninja ninja = new Ninja();
            ninja.setCopias(N);
            int usosTecnica = ninja.quantidadeDeUso();
            System.out.println(usosTecnica);
        }

        scanner.close();
    }
}

