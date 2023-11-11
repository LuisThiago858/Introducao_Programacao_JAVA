package exercicios_01;
public class Triangulo {
    private Integer num1;
    private Integer num2;
    private Integer num3;
    
    public int getNum1(){
        return this.num1;
    }
    public void setNum1(int lado1){//metodo 
        this.num1=lado1;
    }
    public int getNum2(){ //metodos para pegar os numeros
        return this.num2;
    }
    public void setNum2(int lado2){
        this.num2=lado2;
    }
    public int getNum3(){
        return this.num3;
    }
    public void setNum3(int lado3){
        this.num3=lado3;
    }

    public boolean ehTriangulo(int ladoA, int ladoB, int ladoC){
        boolean res;
        res=(Math.abs(ladoB-ladoC) <ladoA)&&(ladoA<(ladoB+ladoC))&&
             (Math.abs(ladoA-ladoC) <ladoB)&&(ladoB<(ladoA+ladoC))&&
             (Math.abs(ladoA-ladoB) <ladoC)&&(ladoC<(ladoA+ladoB));
        return res;
    }

    public void qualTriangulo(int ladoA, int ladoB, int ladoC){
        ladoA=this.getNum1();
        ladoB=this.getNum2();
        ladoC=this.getNum3();

        if((ladoA + ladoB > ladoC)&&
           (ladoC + ladoA > ladoB)&&
           (ladoB + ladoC > ladoA)){
            System.out.println("E um triangulo");
            if((ladoA==ladoB)||
               (ladoB==ladoC)||
               (ladoC==ladoA)){
                System.out.println("E um triangulo equilatero");
            }if((num1!=num2)&&(num2!=num3)&&(num3!=num1)){
                System.out.println("E um triangulo escaleno");
            }if(((num1==num2)!=num3) && ((num1==num2)!=num3) && ((num1==num2)!=num3)){
                System.out.println("E um triangulo isoceles");
            }
        }if (!(num1+num2>num3)||!(num1+num3>num2)||!(num2+num3>num1)){
            System.out.println("Nao e um triangulo");
        }
    }
}
