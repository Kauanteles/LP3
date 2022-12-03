public class DataHora {
    private Date date;
    private Time time;

    public DataHora(int day, int month, int year, int hour, int min, int sec){
        date = new Date(day,month,year);
        time = new Time(hour,min,sec);
    }

    public int getDia(){
        return date.getDay();
    }

    public int getMes(){
        return date.getMonth();
    }

    public int getAno(){
        return date.getYear();
    }

    public int getHora(){
        return time.getHour();
    }

    public int getMinuto(){
        return time.getMinute();
    }

    public int getSegundo(){
        return time.getSecond();
    }

    public String toString(){
        return date.printFullDate() + time.getTime();
    }

    public boolean isEqual(DataHora outraDataHora){
        if((outraDataHora.getDia() == getDia()) && (outraDataHora.getMes() == getMes()) && (outraDataHora.getAno() == getAno())){
            if((outraDataHora.getHora() == getHora())  && (outraDataHora.getMinuto() == getMinuto()) && (outraDataHora.getSegundo() == getSegundo())){
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isGreater(DataHora outraDataHora){
        if (this.date.isPrevious(outraDataHora.date)){
            return true;
        }else {
            if (this.getDia()==outraDataHora.getDia() && this.getMes() == outraDataHora.getMes() && this.getAno() == outraDataHora.getAno()){
                if (this.time.isBiggerThan(outraDataHora.time)){
                    return true;
                }else {
                    return false;
                }
            }else return false;
        }
    }

    public boolean isLower(DataHora outraDataHora){
        if (outraDataHora.date.isPrevious(this.date)){
            return true;
        }else {
            if (this.getDia()==outraDataHora.getDia() && this.getMes() == outraDataHora.getMes() && this.getAno() == outraDataHora.getAno()){
                if (outraDataHora.time.isBiggerThan(this.time)){
                    return true;
                }else {
                    return false;
                }
            }else return false;
        }
    }

    
}

