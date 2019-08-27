import java.util.Date;

/*
 * The first shortcuts we'll practice are given as hints in bloc comments
 * Let's hide them by collapsing recursively, follow along:
 *  - First, go to line 16, press Ctrl + G
 *  - Second, press Ctrl + Alt + NumPad Minus
 * Let's then expand everything except those hints, this time press Ctrl + NumPad Plus
 *
 * To find a shortcut in IntelliJ you can just press Shift, then Shift again and write what you want
 * Alternatively, you can also press Ctrl + Shift + A to access the 'Find Action' bar
 */

public class PracticeDirty {

    public static void main(String[] args) {

        // Section 1 : text editing actions


        System.out.println("Let's try writing up numbers from 1 to 10");

        // Find and use the shortcut to move lines and put them back in the right order
        /* hint : Alt + Shift + up/down */
        System.out.println("9");
        System.out.println("6");
        System.out.println("8");
        System.out.println("10");
        System.out.println("7");

        // Some lines should be deleted, can you do that ?
        /* hint : Ctrl + y */
        System.out.println("I am");
        System.out.println("not");
        System.out.println("a number !");

        // Find and use the shortcut to move lines and put them back in the right order
        /* hint : Alt + Shift + up/down */
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        // Duplicate this line, by now you should find the shortcuts easily
        /* hint : Ctrl + d */
        System.out.println("Yey I wrote them correctly.");


        // You can indent the following lines, start by selecting the 4 following lines
        // then use the correct shortcut to indent
        /* hint : Ctrl + Alt + i */
                               System.out.println("This piece of");
                    System.out.println("code needs");
    System.out.println("some indentation");
                                                System.out.println("right ?");


        // First try using the same shortcut for the 8 following lines
        // What happened ? Try finding another shortcut to do it right
        /* hint : Ctrl + Alt + l */
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
           /* hint : shortcut Ctrl + Alt + m */
        System.out.println("This is a program, that's gonna do some stuff.");
    }

    /*
     * Let's move to something a bit different
     * Here is a method, let's say for the sake of this exercise that it should belong in its own class
     * Try creating a new class and move it there
     * No more hints, but remember to use "Find action"
     */
    static int aMethod(){
        int start = 0;
        int end = 10;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += start;
        }
        return sum;

        /*
         * This seems to be adding all integers from 0 to 10
         * Wouldn't it be nice to be able to know that at a glance ?
         * Why don't you give the method a better name
         */

        /*
         * Another thing, this would be more useful if it accepted parameters for its start and end values
         * You have already extracted a method, maybe there a similar shortcut to extract parameters
         */
    }
}
