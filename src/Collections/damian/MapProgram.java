package Collections.damian;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, " +
                    "object-oriented, platform independant language");
            System.out.println("Java added succesfully");
        }
        languages.put("Python", "an interpreted, object-oriented, high level programing language");
        languages.put("Algol", "an algorithmic langueage");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

//System.out.println(languages.get("Java"));
        if (languages.containsKey("Java")) {
            System.out.println("Java os already in the map");
        } else {


            System.out.println(languages.put("Java", "This course is about java "));
        }
        System.out.println("=======================================================");

//        languages.remove("Lisp");
        if (languages.remove("Algol", "an algorithmic langueage")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol, not removed, key/value pair not found");
        }
        if (languages.replace("Lisp", "This will not work", "a functional programming language"))
        {   System.out.println("List replaced");
    } else

    {
        System.out.println("Lisp was not replaced");
    }
        System.out.println(languages.replace("Scala", "this will not be added"));


        for(String key : languages.keySet()) {
            System.out.println(key+" : " + languages.get(key));
        }


    }
}
