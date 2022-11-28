public class Time{
    private int hora;
    private int min;
    private int seg;

    public Time(int hora, int min, int seg){
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Time(){
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }

    public boolean isAm(){
        if((this.hora < 12) && (this.hora > 0)){
            return true;
        }
        return false;
    }

    public boolean isBiggerThan(Time outraHora){
        if (this.hora>outraHora.hora){
            return true;
        }else{
            if (this.min>outraHora.min){
                return true;
            }else{
                if(this.seg>outraHora.seg){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }

    public int cron(Time outraHora){

        if (isBiggerThan(outraHora)){
            int hour = Math.abs((24-this.hora) + outraHora.getHour());
            int minute = Math.abs(outraHora.getMinute() - this.min);
            int second = Math.abs(outraHora.getSecond() - this.seg);
            int segundosTotais = (hour * 3600) + (minute * 60) + (second);
            if (outraHora.min<this.min){
                segundosTotais=segundosTotais-(minute*60);
            }
            if (outraHora.seg<this.seg){
                segundosTotais=segundosTotais-(second);
            }
            return segundosTotais;
        }

        int hour = Math.abs(outraHora.getHour() - this.hora);
        int minute = Math.abs(outraHora.getMinute() - this.min);
        int second = Math.abs(outraHora.getSecond() - this.seg);

        return (hour * 3600) + (minute * 60) + (second);
    }

    

    public void addSeconds(int secs){
        if(secs < 0){
            System.out.printf("Invalid seconds!!\n");
            System.exit(-1);
        }
        this.seg = this.seg + secs;
        if(this.seg >= 60){
            this.min = this.min + this.seg / 60;
            this.seg = this.seg % 60;
            if(this.min >= 60){
                this.hora = this.hora + this.min / 60;
                this.min = this.min % 60;
                if(this.hora >= 24){
                    this.hora = this.hora % 24;
                }
            }
        }
    }

    public int getHour(){
        return this.hora;
    }

    public int getMinute(){
        return this.min;
    }

    public int getSecond(){
        return this.seg;
    }

    private boolean validateTime(int hora, int min, int seg){
        return validateHour(hora) && validateMinOrSec(min) && validateMinOrSec(seg);
    }

    private boolean validateHour(int hora){
        if((hora>0) && (hora<25))
            return true;
        else
            return false;
    }

    private boolean validateMinOrSec(int param){
        if((param>0) && (param<61))
            return true;
        else
            return false;
    }

    public void setTime(int hora, int min, int seg){
        if (validateTime(hora, min, seg)) {
            this.hora = hora;
            this.min = min;
            this.seg = seg;
        }
        else{
            this.hora = 0;
            this.min = 0;
            this.seg = 0;
        }
    }

    public String getTime(){
        String res = this.hora + ":" + this.min + ":" + this.seg;
        return res;
    }

    public void prnTime(){
        System.out.println(getTime());
    }
}