package Prova01;
import java.util.Scanner;
public class Temperatura {
    private float farenheit;

    public float getFarenheit(){
        return this.farenheit;
    }

    public void setFarenheit(float novoFarenheit){
        this.farenheit=novoFarenheit;
    }

    public void converteCelsius(){
        float tempFarenheit=this.getFarenheit();
        float conversaoCelsius=((tempFarenheit-32.0f)/1.8f);

        System.out.printf("Temperatura em F: %.1f\n", tempFarenheit);
        System.out.printf("Temperatura em C: %.1f", conversaoCelsius);
    }

    public static void main(String[] args){
        Temperatura temperatura=new Temperatura();
        Scanner ler=new Scanner(System.in);

        float tempT=ler.nextFloat();
        temperatura.setFarenheit(tempT);
        temperatura.converteCelsius();
    }
}
