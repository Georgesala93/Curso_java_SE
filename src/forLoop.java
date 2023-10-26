public class forLoop {
    static  boolean isTurnOnLight = false;

    public static void main(String[] args) {
        for (int i = 0; i <=9; i++) {
            printSOS();
        }
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;


    }
}
