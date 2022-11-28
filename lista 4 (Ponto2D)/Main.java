public class Main{
    public static void main(String[] args) {
        Ponto2D ponto = new Ponto2D(0, 0);
        Ponto2D ponto1 = new Ponto2D(100, 200);

        System.out.println(ponto.getX());
        System.out.println(ponto.getY());

        ponto.imprimirPonto();

        if(ponto.isEixoX()){
            System.out.println("esta no eixo x");
        }
        if(ponto.isEixoY()){
            System.out.println("esta no eixo y");
        }

        System.out.println(ponto.quadrante());

        System.out.println(ponto.distancia(ponto1));
        System.out.println(ponto1.distancia());
        System.out.println(ponto.distancia(ponto1.getX(),ponto1.getY()));

        
    }
}