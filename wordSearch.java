package wordSearch;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class wordSearch {



    public static void main(String[] args){


        try {
            File f = new File("D:\\IdeaProjects\\wordSearch\\src\\wordSearch\\dict2.txt");
            Scanner scan = new Scanner(f);
            fileReader file = new fileReader(scan);

            file.anagramCheat();

        }catch (FileNotFoundException e){

            System.err.format("file doesnt exist");

        }


       // Cipher newCipher = new Cipher();

       // newCipher.railFenceCipher("hello how are you", 3);



    }

}

