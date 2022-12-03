public class Main{
    public static void main(String[] args){
        Ponto2D A = new Ponto2D(6,8);
        Ponto2D B = new Ponto2D(8,4);
        Ponto2D C = new Ponto2D(4,2);

        Triangulo triangulo = new Triangulo(A, B, C);

        System.out.println(Triangulo.isTrianguloEquilatero(triangulo));
        System.out.println(Triangulo.isTrianguloIsoiceles(triangulo));
        System.out.println(Triangulo.isTrianguloRetangulo(triangulo));
        System.out.println(triangulo.toString());
    }
}