public class ConcatenarStrings {

    public static void main(String[] args) {
        //String concat with concat() method
        String string1 = "Estoy haciendo ";
        String string2 = "una concatenacion en Java";
        //here we use concat() method to join the two strings above
        String result = string1.concat(string2);
        System.out.println(result);
        //concat() method to join 4 strings
        String myWebSite = "Estudio".concat("en").concat("las").concat("noches");
        System.out.println(myWebSite); // here we've got  "CodeGym.cc/quest"

        System.out.println(myMessage(true));
        System.out.println(myMessage(false));
    }

    private static String myMessage(boolean b) {   //concat() method with selection statement
        return "I have".concat(b ? " " : "n't ").concat("got it");
    }

}