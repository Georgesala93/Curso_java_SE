public class Arrays {
    public static void main(String[] args) {
        int inum = 7;
        String c = "w";
        System.out.println((inum >= 6) && (c == "w"));

        String [] androidVerons = new String[17];
        String days[] = new String[7];

        // Array de dos dimenciones
        String[][] cities = new String[4][2];

        // Array de tres dimenciones
        int[][][] numbers = new int[2][2][2];

        // Array de cuatro dimenciones
        int[][][][] numbers4 = new int[2][2][2][2];

        System.out.println("------ Versiones Android ------");

        androidVerons[0] = "Apple Pie";
        androidVerons[1] = "Bannana Bread";
        androidVerons[2] = "Cupcake";
        androidVerons[3] = "Donut";

        for (int i = 0; i <androidVerons.length ; i++) {
            if (androidVerons[i] != null) {
                System.out.println(androidVerons[i]);
            }
        }

        for (String androidVersion: androidVerons) {
            if (androidVersion != null) {
                System.out.println(androidVersion);
            }
        }
        /*System.out.println(androidVerons[0]);
        System.out.println(androidVerons[1]);
        System.out.println(androidVerons[2]);
        System.out.println(androidVerons[3]);*/

        System.out.println();
        System.out.println();

        System.out.println("------ Ciudades ------");

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        for (int i = 0; i <cities.length ; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                if (cities[i] != null) {
                    System.out.println(cities[i][j]);
                }
            }
        }

        for (String[] pair : cities) {
            for (String name : pair) {
                System.out.println(name);
            }
        }

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/

        System.out.println();
        System.out.println();

        System.out.println("------ Animales ------");

        String[][][][] animals = new String[2][3][2][2];
        animals [1][0][0][1] = "Monkey";
        System.out.println(animals [1][0][0][1]);

        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=0 ; j++) {
                for (int k = 0; k <=0 ; k++) {
                    for (int l = 0; l <=1 ; l++) {
                        if (animals[i][j][k][l] != null) {
                            System.out.println(animals[i][j][k][l]);
                        }
                    }
                }                
            }            
        }
    }
}
