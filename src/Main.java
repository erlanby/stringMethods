import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str = "salam";
        char s = str.charAt(1); // Salam деген создун 1 индексин сурап жатабыз
        System.out.println(s);

        String str1 = "Erlan Aitmatov";
        String sym = str1.substring(5); // subString созду кырып коет
        System.out.println(sym);

        String str2 = "Talas";
        System.out.println(str2.contains("talas")); // true or false эки созду окшошпу текшерип берет (ASCILL код)

        String str3 = "Aitmatov";
        System.out.println(str3.toUpperCase()); // upper ойдого карай ... чон кылат тамгаларды
        System.out.println(str3.toLowerCase()); // lower ылдыйга карай ... кичине кылат

        String str4 = "          Era Gera ";
        System.out.println(str4.trim()); // trim боштукту алып салат ... пробелди

        String str5 = "Hello";
        String str6 = "hello";
        System.out.println(str5.equals(str6)); // equals = Эки соз барабарбы же жокпу
        System.out.println("Hello".equalsIgnoreCase("hello")); // Игнор кылып эки созду окшош чыгаруу



        String str8 = "Erlan Aitmatov";
        String newStr8 = str8.replace("Erlan", "Nurlan"); // replace - заменить // созду алмаштыруу
        System.out.println(newStr8);

        System.out.println("Salam" + "Erlan"); // Конкетация + or -

        String name = "Elnura";
        String name2 = " Aida";
        String concat = name.concat(name2);
        System.out.println(concat);


    }
}