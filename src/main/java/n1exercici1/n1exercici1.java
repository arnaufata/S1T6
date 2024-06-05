package n1exercici1;

import n1exercici1.models.NoGenericMethods;

public class n1exercici1 {

    public static void runProgram(){

        NoGenericMethods instancia1 = new NoGenericMethods("Arnau", "Bernal", "Alvarez");
        NoGenericMethods instancia2 = new NoGenericMethods("Alvarez", "Arnau", "Bernal");
        NoGenericMethods instancia3 = new NoGenericMethods("Bernal", "Alvarez", "Arnau");

        System.out.println(instancia1.getObjecte1() + ", " + instancia1.getObjecte2() + ", "
                + instancia1.getObjecte3());
        System.out.println(instancia2.getObjecte1() + ", " + instancia2.getObjecte2() + ", "
                + instancia2.getObjecte3());
        System.out.println(instancia3.getObjecte1() + ", " + instancia3.getObjecte2() + ", "
                + instancia3.getObjecte3());
    }
}
