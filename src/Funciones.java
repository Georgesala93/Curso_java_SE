public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo = pi * r2

       circleArea(y);
        System.out.println("Area del circulo: " + circleArea(y));

        //Utilizando la funcion converToDolar
        System.out.println("Convercion a Dolar: "+ converToDolar(10000,"COP"));
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r,2);
    }
    /**
     * Descripción: Funcion que especificando su moneda, convierte una cantidad de dinero a Dolares
     *
     * @param currency Cantidad de dinero
     * @param quantity tipo de moneda: solo acepta COP o MXN
     * @return quantity Devuelve la cantidad actualizada en Dolares
     * */
    public static double converToDolar(double quantity, String currency) {
        //CURRENCY: COP, MXN
        switch (currency){
            case "MXN":
                quantity = quantity * 0.055;
            case "COP":
                quantity = quantity * 0.00024;
        }
        return quantity;
    }
}
