package n2exercici1;

import n2exercici1.models.GenericMethods;
import n2exercici1.models.Persona;

public class n2exercici1 {
    public static void runProgram(){

        Persona persona1 = new Persona("Arnau", "Alvarez", 26);

        GenericMethods.metodeGeneric(persona1, "Català", 1997);
        GenericMethods.metodeGeneric("Tailandes", persona1, 2000);

        /* La següent acció ens produirà un error:

        GenericMethods.metodeGeneric(persona1, 2010, "Tailandes"); */
    }
}
