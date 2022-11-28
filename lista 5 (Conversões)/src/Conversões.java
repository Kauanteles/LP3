public class Conversões {
    
    public static double gramasToQuilos(double grama){
        return grama/1000;
    }

    public static double gramasToLibras(double grama){
        return grama/453.6;
    }

    public static double gramasToOnças(double grama){
        return grama/28.35;
    }



    public static double quilosToGramas(double quilo){
        return quilo*1000;
    }

    public static double quilosToLibras(double quilo){
        return gramasToLibras(quilosToGramas(quilo));
    }

    public static double quilosToOnças(double quilo){
        return gramasToOnças(quilosToGramas(quilo));
    }



    public static double librasToGramas(double libra){
        return libra*453.6;
    }

    public static double librasToQuilos(double libra){
        return gramasToQuilos(librasToGramas(libra));
    }

    public static double librasToOnças(double libra){
        return gramasToOnças(librasToGramas(libra));
    }



    public static double onçasToGramas(double onças){
        return onças*28.35;
    }

    public static double onçasToQuilos(double onças){
        return gramasToQuilos(onçasToGramas(onças));
    }

    public static double onçasToLibras(double onças){
        return gramasToLibras(onçasToGramas(onças));
    }
}
