package basic.c05_structures;

import java.util.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Gatherer.Integrator;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] names = new String[2];
        System.out.println(names.length);

        names[0] = "santiago";
        names[0] = "aslin";

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes
        // y después de modificarlo.
        System.out.println(names[0]);
        names[0] = "women";
        System.out.println(names[0]);

        // 3. Crea un ArrayList vacío.
        ArrayList<Integer> LLeno = new ArrayList<Integer>();
        System.out.println(LLeno.size());

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.

        LLeno.add(67);
        LLeno.add(78);
        LLeno.add(69);
        LLeno.add(80);

        System.out.println(LLeno.size());

        LLeno.removeFirst();

        System.out.println(LLeno.getFirst());

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(67);
        numbers.add(76);
        System.out.println(numbers);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        numbers.add(67);
        numbers.add(78);
        System.out.println(numbers);

        // 7. Elimina uno de los elementos del HashSet.

        numbers.remove(67);
        System.out.println(numbers);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de
        // teléfono. Añade tres contactos.

        HashMap<String, String> User = new HashMap<>();

        User.put("santiago", "3205948759");
        User.put("aslin", "3205945688");
        User.put("claudia", "3218866777");
        System.out.println(User);

        // 9. Modifica uno de los contactos y elimina otro.

        User.replace("santiago", "3205948759", "1113784573");

        System.out.println(User);

        User.remove("claudia", "3218866777");

        System.out.println(User);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.

        String[] nombres = { "santiago", " stefany" };

        ArrayList<String> nom = new ArrayList<>(Arrays.asList(nombres));

        HashSet<String> mySet = new HashSet<>(nom);
        HashMap<String, String> myHashMap = new HashMap<>();

        for (String n : mySet) {
            myHashMap.put(n, n);
        }
        System.out.println("RESULTADO FINAL DE MI Arrays : " + myHashMap);

    }
}
