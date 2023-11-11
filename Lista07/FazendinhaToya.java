/*
 * Enunciado
Fazendinha Toya v1.0
Crie uma classe chamada FazendinhaToya.
Sua classe deverá ter 2 atributos do tipo inteiro e 2 atributos do tipo float.
Seu programa deve ler um valor N referente a quantidade de vezes que toda a operação será realizada.
Um valor R que se refere a raça do boi e um valor Q que é a quantidade de valores a serem lidos referentes aos pesos dos bois dessa raça que foi informada.
Ao final seu programa deve mostrar a quantidade de bois e a soma do peso total de cada raça separadamente.
 

Dicas
É obrigatório o uso do comando for.
As opções de raça são somente branco(b) e preto(p)
Exemplos de Entrada e Saída
Entrada	
2
p
1
548.78
b
1
600.66
Saída	
Quantidade de bois brancos: 1
Peso total dos bois brancos: 600.66 KG
Quantidade de bois pretos: 1
Peso total dos bois pretos: 548.78 KG
 */
package Lista07;

import java.util.Scanner;

public class FazendinhaToya {
    private int numeroPretos;
    private int numeroBrancos;
    private float pesoPretos;
    private float pesoBrancos;

    public int getNumeroPretos() {
        return this.numeroPretos;
    }

    public void setNumeroPretos(int novNumP) {
        this.numeroPretos = novNumP;
    }

    public int getNumeroBrancos() {
        return this.numeroBrancos;
    }

    public void setNumeroBrancos(int novNumB) {
        this.numeroBrancos = novNumB;
    }

    public float getPesoBrancos() {
        return this.pesoBrancos;
    }

    public void setPesoBrancos(float pesoDoBoiBranco) {
        this.pesoBrancos = pesoDoBoiBranco;
    }

    public float getPesoPretos() {
        return this.pesoPretos;
    }

    public void setPesoPretos(float pesoDoBoiPreto) {
        this.pesoPretos = pesoDoBoiPreto;
    }

    public void calculaSomatorioDePesos() {
        Scanner ler = new Scanner(System.in);
        char racaDoBoi = ler.next().charAt(0);

        if (racaDoBoi == 'b') {
            int repetirTemp;
            repetirTemp = ler.nextInt();
            this.setNumeroBrancos(this.getNumeroBrancos() + repetirTemp);
            for (int i = 0; i < repetirTemp; i++) {
                float pesoDosBrancos = ler.nextFloat();
                this.setPesoBrancos(this.getPesoBrancos() + pesoDosBrancos);
            }
        } else if (racaDoBoi == 'p') {
            int repetirTemp2 = ler.nextInt();
            this.setNumeroPretos(this.getNumeroPretos() + repetirTemp2);
            for (int i = 0; i < repetirTemp2; i++) {
                float pesoDosPretos = ler.nextFloat();
                this.setPesoPretos(this.getPesoPretos() + pesoDosPretos);
            }
        }
    }

    public static void main(String[] args) {
        FazendinhaToya fazenda = new FazendinhaToya();
        Scanner ler = new Scanner(System.in);
        int numeroDeVezes = ler.nextInt();
        for (int i = 0; i < numeroDeVezes; i++) {
            fazenda.calculaSomatorioDePesos();
        }
        System.out.println("Quantidade de bois brancos: " + fazenda.getNumeroBrancos());
        System.out.printf("Peso total dos bois brancos: %.2f KG%n", fazenda.getPesoBrancos());
        System.out.println("Quantidade de bois pretos: " + fazenda.getNumeroPretos());
        System.out.printf("Peso total dos bois pretos: %.2f KG%n", fazenda.getPesoPretos());
    }
}
