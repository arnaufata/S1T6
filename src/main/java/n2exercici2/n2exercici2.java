package n2exercici2;

import n2exercici2.models.GenericMethods;
import n2exercici2.models.Persona;

public class n2exercici2 {
    public static void runProgram(){

        Persona persona1 = new Persona("Arnau", "Alvarez", 26);

        GenericMethods.metodeGeneric(persona1, "Català", 1997);
        GenericMethods.metodeGeneric("Tailandes", persona1, 2000);
        GenericMethods.metodeGeneric("Pes: ", 90.5, "Estatura: ", 1.73);

    }
}
