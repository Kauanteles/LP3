public class Main {
    public static void main(String[] args) {
        Lâmpada lampada = new Lâmpada(1);
        lampada.mostraEstado();
        lampada.apaga();
        lampada.mostraEstado();
        lampada.setLightLevel(50);
        lampada.mostraEstado();
    }
}
