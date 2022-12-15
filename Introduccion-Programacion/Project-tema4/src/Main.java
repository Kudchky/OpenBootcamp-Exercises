public class Main {
    public static void main(String[] args) {
        System.out.printf(numPosNeg(0));

        mientras(-8);

        hacer(5);

        para(0);

        station("Verano");
    }

    public static String numPosNeg(int numeroIf) {
        if(numeroIf > 0){
            return "Numero Positivo";
        } else if (numeroIf < 0) {
            return "Numero Negativo";
        } else {
            return "Numero 0";
        }
    }

    public static void mientras(int numeroWhile) {
       while(numeroWhile < 3) {
           System.out.println(numeroWhile);
           numeroWhile++;

       }
    }

    public static void hacer(int numeroDo) {
        do {
            System.out.println(numeroDo);
            numeroDo++;
        }while(numeroDo < 3);
    }

    public static void para(int numeroFor) {
        for(int i = numeroFor; i <= 3; i++){
            System.out.println(i);
        }
    }

    public static void station(String estacion){
        switch (estacion) {
            case "Primavera":
                System.out.println("Es la estacion de la Primavera");
                break;
            case "Verano":
                System.out.println("Es la estacion del Verano");
                break;
            case "Otoño":
                System.out.println("Es la estacion del Otoño");
                break;
            case "Invierno":
                System.out.println("Es la estacion del Invierno");
                break;
            default:
                System.out.println("Estacion Incorrecta");
        }
    }
}