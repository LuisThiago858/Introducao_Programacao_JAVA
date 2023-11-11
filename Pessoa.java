import Lista09.Vetor;

public class Pessoa{
    private String nome;
    private int idade;
    private boolean vivo;

    public void setNome(String novoNome){
        this.nome=novoNome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int novaIdade){
        this.idade=novaIdade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setVivo(boolean estaVivo){
        this.vivo=estaVivo;
    }
    public boolean getVivo(){
        return this.vivo;
    }

    public void digaSeuNome(){
        System.out.println(this.getNome());
    }
    public void digaSuaIdade(){
        System.out.println(this.getIdade());
    }
    public void digaSeEstaVivo(){
        System.out.println(this.getVivo());
    }

    public static void main(String[] args){
        Pessoa individuo=new Pessoa();
        individuo.setNome("Jupiteru");
        individuo.setIdade(21);
        individuo.setVivo(true);

        individuo.digaSeuNome();
        individuo.digaSuaIdade();
        individuo.digaSeEstaVivo();
    }
}

public class Main {
    public static void main(String[] args) {
        int[] vetor = {10, 5, 8, 20, 15, 30, 25};
        
        int primeiroMaior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > primeiroMaior) {
                segundoMaior = primeiroMaior;
                primeiroMaior = vetor[i];
            } else if (vetor[i] > segundoMaior && vetor[i] != primeiroMaior) {
                segundoMaior = vetor[i];
            }
        }
        
        System.out.println("Maior valor: " + primeiroMaior);
        System.out.println("Segundo maior valor: " + segundoMaior);
    }
}


public boolean primos(int num){
    boolean resp=true;
    if(num<=1){
        resp=false;
    }
    for(int i =2; i< num; i++){
        if(num%i==0){
            resp=false;
        }
    }
    return resp;
}

public void somaOsPrimos(){
    int somaPrimos=0;
    for(int i=0; i<this.getTamanho(); i++){
        if(primos(this.getElemento(i))){
            somaPrimos+=this.getElemento(i);
        }
    }
    System.out.println(somaPrimos);
}


public class IntercalarVetores {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {6, 7, 8, 9, 10};
        
        int tamanho = vetor1.length + vetor2.length;
        int[] vetorAux = new int[tamanho];
        
        int indiceVetor1 = 0;
        int indiceVetor2 = 0;
        
        for (int i = 0; i < tamanho; i++) {
            if (indiceVetor1 < vetor1.length) {
                vetorAux[i] = vetor1[indiceVetor1];
                indiceVetor1++;
            }
            if (indiceVetor2 < vetor2.length) {
                vetorAux[i] = vetor2[indiceVetor2];
                indiceVetor2++;
            }
        }
        
        // Imprimir o vetor intercalado
        System.out.print("Vetor Intercalado: ");
        for (int elemento : vetorAux) {
            System.out.print(elemento + " ");
        }
    }
}

public void intercalaVetores(Vetor vet1, Vetor vet2){
    int tamanho=vet1.getTamanho()*vet2.getTamanho();
    int []aux=new int[tamanho];
    int indiceVet1=0;
    int indiceVet2=0;
    for(int i=0; i<tamanho; i++){
        if(indiceVet1<vet1.getTamanho()){
            aux[i]=vet1.getElemento(indiceVet1);
            indiceVet1++;
        }
        else if(indiceVet2<vet2.getTamanho()){
            aux[i]=vet2.getElemento(indiceVet2);
            indiceVet2++;
        }
        for(int i=0; i<tamanho; i++){
            System.out.print(aux[i]+" ");
        }
    } //entrada 4 7 5 6 3 2 6 8 9 3 e a saida 4 2 7 6 5 8 6 9 3 3
}

public class Vetor {
    private int[] vet;
    private int dimensao;

    public Vetor(int dimensao) {
        this.dimensao = dimensao;
        this.vet = new int[dimensao];
    }

    public int getDimensao() {
        return dimensao;
    }

    public int getElemento(int indice) {
        return vet[indice];
    }

    public void setElemento(int indice, int valor) {
        vet[indice] = valor;
    }

    public int buscaMenor() {
        int menorValor = vet[0];
        int indiceMenor = 0;

        for (int i = 1; i < dimensao; i++) {
            if (vet[i] < menorValor) {
                menorValor = vet[i];
                indiceMenor = i;
            }
        }

        return indiceMenor;
    }

    public void trocaMenorComMaior() {
        int indiceMenor = buscaMenor();
        int indiceMaior = 0;
        int maiorValor = vet[0];

        for (int i = 1; i < dimensao; i++) {
            if (vet[i] > maiorValor) {
                maiorValor = vet[i];
                indiceMaior = i;
            }
        }

        // Troca o menor com o maior
        int temp = vet[indiceMenor];
        vet[indiceMenor] = vet[indiceMaior];
        vet[indiceMaior] = temp;
    }

    public void exibirVetor() {
        for (int i = 0; i < dimensao; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int dimensao = 5;
        Vetor vetor = new Vetor(dimensao);

        vetor.setElemento(0, 1);
        vetor.setElemento(1, 2);
        vetor.setElemento(2, 3);
        vetor.setElemento(3, 4);
        vetor.setElemento(4, 5);

        System.out.println("Entrada:");
        vetor.exibirVetor();

        vetor.trocaMenorComMaior();

        System.out.println("Saída:");
        vetor.exibirVetor();
    }
}


