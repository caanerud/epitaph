/**
 * Created by chrisaanerud on 3/5/17.
 */
//allows me to use the Scanner (uses white space to separate tokens) and nextLine actions below
import java.util.Scanner;

//main class
public class Main {
    /* "public" means that main() can be called from anywhere
"static" means that main() doesn't belong to a specific object
"void" means that main() returns no value
"main" is the name of a function. main() is special because it is the start of the program.
"String[]" means an array of String.
"args" is the name of the String */
    public static void main(String args[]) {
        //a class that breaks its input into tokens using a delimiter pattern, which by default matches whitespace(s)
        Scanner input = new Scanner(System.in);
        //prints title
        System.out.println("My epitaph");
        //prints blank space
        System.out.println();
        System.out.println();
        //prints a request for the user to type a word
        System.out.println(" Please type your name and press ENTER ");
        //names the String class; lets the user input text and then jumps to the next question when you hit enter
        String name = input.nextLine();

        System.out.println(" Please type your most prized possession and press ENTER. ");
        String possession = input.nextLine();

        System.out.println(" Please type the name of a type of food (plural) commonly found in a dumpster and then press ENTER. ");
        String foodName = input.nextLine();

        System.out.println(" Please type a noun and press ENTER ");
        String noun = input.nextLine();

        System.out.println(" Please type a verb and press ENTER ");
        String verb = input.nextLine();

        System.out.println(" Please type the name of an authority figure or deity of your choice and then press ENTER ");
        String authorityFigure = input.nextLine();

        System.out.println(" Please type a short phrase IN ALL CAPS describing your imminent death and press ENTER ");
        String shortPhrase = input.nextLine();
        //signals the end of the questions and prints a few sentences, concatenating strings and the string classes that point to the answers that the user entered.
        System.out.println("");
        System.out.println("");

        System.out.println("Here lies " + name + ", who dearly loved a " + possession + " and eating " + foodName + " more than anything else.");
        System.out.println("Please " + verb + " and shout from the " + noun + " that " + name + " screamed " + shortPhrase + " in the inevitable face of " + authorityFigure + ".");
        //ends program
        input.close();
    }
}

