package n1exercici2;

import n1exercici2.models.GenericMethods;
import n1exercici2.models.Persona;

public class n1exercici2 {
    public static void runProgram(){

        Persona persona1 = new Persona("Arnau", "Alvarez", 26);

        GenericMethods.metodeGeneric(persona1, "Català", 1997);
        GenericMethods.metodeGeneric("Tailandes", persona1, 2000);
    }
}
