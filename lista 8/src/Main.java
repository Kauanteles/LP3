public class Main{
    public static void main(String[] args){
        Circulo c = new Circulo(2f, 2f, 5f, 5f);
        System.out.println(c.toString());
        System.out.println(c.calculaArea());
        System.out.println(c.calculaPerimetro());

        Retângulo r = new Retângulo(2f, 5f, 6f, 15f, 2f, 5f, 6f, 15f);
        System.out.println(r.toString());
        System.out.println(r.calculaArea());
        System.out.println(r.calculaPerimetro());

        Quadrado s = new Quadrado(1, 4, 2, 5, 1, 4, 2, 5);
        System.out.println(s.toString());
        System.out.println(s.calculaArea());
        System.out.println(s.calculaPerimetro());

        Triângulo t = new Triângulo(1, 2, 2, 4, 5, 6);
        System.out.println(t.toString());
        System.out.println(t.calculaArea());
        System.out.println(t.calculaPerimetro());
    }
}
