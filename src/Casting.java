public class Casting {
    public static void main(String[] args) {

        // En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println("Perritos ubicados: " + monthlyDogs);
       

        //ESIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println("Perritos ubicados: " + estimatedMonthlyDogs);


        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println("Perritos ubicados: " + (double) a/b);

        //Clase: Casteo entre tipos de datos
        double c = (double) a/b;
        System.out.println(c); //2.0 sin casteo (double) y 2.5 con casteo

        char n = '1';
        int nI =n;
        System.out.println(n); // el dato caracter si cabe en el campo int

        short nS = (short) n;  // se castea ya que el tipo de dato short en mas pequeño que un chart
        System.out.println(n);


    }
}
