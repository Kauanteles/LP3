public class Lâmpada {
    private int estado;
    private float lightLevel;

    public Lâmpada(int estado){
        this.estado = estado;
        this.lightLevel= 100;
    }

    public Lâmpada(float lightLevel){
        this.lightLevel = lightLevel;
        this.estado = 2;
    }

    public Lâmpada(){
        this.estado = 0;
        this.lightLevel = 0;
    }

    public void acende(){
        this.estado = 1;
        this.lightLevel=100;
    }
    public void apaga(){
        this.estado = 0;
        this.lightLevel=0;
    }
    public void mostraEstado(){
        if(this.lightLevel == 100){
            System.out.println("lampada acesa");
        }else if(this.lightLevel >0 &&this.lightLevel < 100){
            System.out.println("lampada na metade");
        }else System.out.println("lampada apagada");
    }

    public void meioAcesa(){
        this.estado = 2;
    }

    public boolean validLight(){
        if(lightLevel>=0 && lightLevel<=100){
            return true;
        }else return false;
    }

    public void setLightLevel(float luz){
        if (validLight()){
        this.lightLevel=luz;
        }
    }

    public boolean estaligada(){
        if(estado == 1){
            return true;
        }else return false;
    }
}
