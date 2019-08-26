import java.util.Date;

/*
 * To find a shortcut in Intellij you can just press shift shift and write what you want
 * Alternatively, you can also press ctrl + shift + A to access the 'Search Everywhere' bar
 */

public class PracticeDirty {

    public static void main(String[] args) {

        // Section 1 : text editing actions


        System.out.println("Let's try writing up numbers from 1 to 10");

        // find and use the shortcut to move lines and put them back in the right order
        /* hint : alt + shift + up/down */
        System.out.println("9");
        System.out.println("6");
        System.out.println("8");
        System.out.println("10");
        System.out.println("7");

        // Some lines should be deleted, can you do that ?
        /* hint : ctrl + y */
        System.out.println("I am");
        System.out.println("not");
        System.out.println("a number !");

        // find and use the shortcut to move lines and put them back in the right order
        /* hint : alt + shift + up/down */
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        // Duplicate this line, by now you should find the shortcuts easily
        /* hint : ctrl + d */
        System.out.println("Yey I wrote them correctly.");


        // You can indent the following lines, start by selecting the 4 following lines
        // then use the correct shortcut to indent
        /* hint : ctrl + alt + i */
                               System.out.println("This piece of");
                    System.out.println("code needs");
    System.out.println("some indentation");
                                                System.out.println("right ?");


        // First try using the same shortcut for the 8 following lines
        // What happened ? Try finding another shortcut to do it right
        /* hint : ctrl + alt + l */
                 final boolean test = 1 > 3;
        String answer;
        if(                            test ==true){
                                answer = "yes, one is higher than three";
    }                   else {
            answer =                              "no, three is higher than one";
        }
                             System.out.println("The answer is : " + answer);


        System.out.println("We want to have add values " +
                "together and prints out the results.");



        System.out.println("Adding 1 and 2 gives :" + 1 + 2);
        System.out.println("Adding 3 and 4 gives :" + 3 + 4);

        String z = "";
        System.out.println("Adding x and y gives :" + z);



        // Find and use the shortcut 'Extract a method' and name it info
        // hint : shortcut ctrl+alt+m
        System.out.println("This is a program, that's gonna do some stuff.");

    }
}
