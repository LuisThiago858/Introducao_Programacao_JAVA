package exercicios_01;
public class Media {
    public void calculoMedia(float num1, float num2, float num3, float num4){
        float resultado;
        resultado=(num1+num2+num3+num4)/4.0f;
        if((resultado>=7.0f)&&(resultado<=10.0f)){
            System.out.println("parabens aluno, você esta aprovado sua nota e "+resultado);
        }else if((resultado>=5.0f)&&(resultado<=7.0f)){
            System.out.println("foi mal aluno, você tem que fazer a PF e sua nota e "+resultado);
        }else if((resultado<=5.0f)&&(resultado>=0.0f)){
            System.out.println("Que pena aluno, você esta reprovado e sua nota e "+resultado);
        }else{
            System.out.println("Ouve um erro, verifique suas notas e tente novamente ");
        }
    }
}
