public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Operadores asignación
        System.out.println("------------Operadores asignación----------");
        System.out.println("a es igual que b? -> 'a == b' : " + (a == b));
        System.out.println("a es diferete de b? -> 'a != b' : " + (a != b));

        //Operadores Relaciones
        System.out.println("-----------Operadores Relacionales---------");
        System.out.println("a es mayor que b? -> 'a > b' : " + (a > b));
        System.out.println("a es menor que b? -> 'a < b' : " + (a < b));
        System.out.println("a es mayor o igual que b? -> 'a >= b' : " + (a >= b));
        System.out.println("a es menor o igual que b? -> 'a <= b' : " + (a <= b));

        //Switch
        System.out.println("-----Utilizacion de condicional Switch-----");
        String profe = "Oscar";

        switch (profe) {
            case "Anahí":
                System.out.println("¡Profesora de Java!");
                break;
            case "Oscar":
                System.out.println("¡Profesor de React.js!");
                break;
            case "JuanDC":
                System.out.println("Oye niño, ¿qué haces aquí?");
                break;
                default:
                System.out.println("¡Un nuevo profe!");
                break;
        }
    }
}
