public class whileLoop {
    static  boolean isTurnOnLight = false;
    public static void main(String[] args) {

        turnOnOffLight();

        int i = 1;
        int cant = 10;
        while (isTurnOnLight && i++<=cant){
            printSOS();
        }

    }

    // void: la funcion no retorna nada
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        //forma reducida o con operador ternario
        isTurnOnLight = (isTurnOnLight)?false:true;

        //forma tradicional
        //if (isTurnOnLight){
        //    isTurnOnLight = false;
        //}else {
        //    isTurnOnLight = true;
        //}

        return isTurnOnLight;


    }
}
