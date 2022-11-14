public class Main {
    public static void main(String[] args){
        Circulo circulo = new Circulo(20, 10, 50);
        Ponto2D ponto = new Ponto2D(40, 20);
        Circulo circulo2 = new Circulo(40, 20, 100);
        circulo.imprimeCirculo();
        if (circulo.isInnerPoint(ponto)){
            System.out.println("esta contido");
        }else {System.out.println("não esta contido");}

        System.out.println(circulo.area());
        System.out.println(circulo.perimetro());

        if(circulo2.isBiggerThan(circulo)){
            System.out.println("é maior");
        }else System.out.println("é menor");
    }
}
