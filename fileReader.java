package wordSearch;

import java.util.*;

public class fileReader {

    Scanner scan;

    public fileReader(Scanner sc){

        scan = sc;

    }
    public fileReader(){

    }


    public void searchDictForSymLetters(){

        ArrayList<String> letters = new ArrayList<String>();
        Scanner scan2 = new Scanner(System.in);


        System.out.println("How many letters do you want to search for?");
        int num = scan2.nextInt();

        System.out.println("Okay, now type the letters");
        int i = 0;
        do{

            letters.add(scan2.nextLine());

            i++;


        }while(i <= num);


        int counter = 0;
        int wordCount = 0;

        while(scan.hasNextLine()){
            String str = scan.nextLine();

            for(int j = 0; j < letters.size(); j++){

                if(str.contains(letters.get(j))){
                    counter++;
                }
            }
            if(counter-1 == num){

                System.out.println(str);
                wordCount++;

            }
            counter = 0;

        }
        System.out.println("\nNumber of words that contain the inputted letters: " + wordCount);

    }
/*
    public void unscrambleList(){

        ArrayList<Character> letters = new ArrayList<Character>();
        Scanner scan2 = new Scanner(System.in);


        System.out.println("Please input the word:");
        String word = scan2.next();

        int i = 0;
        do{

            letters.add(word.charAt(i));
            i++;

        }while(i < word.length());

        int counter = 0;
        int wordCount = 0;
        String alph = "abcdefghijklmnopqrstuvwxyz";
        String newAlph = "";
        boolean isTrue = false;
        for(int k = 0; k < alph.length(); k++){
            for(int h = 0; h < letters.size(); h++){

                if(alph.charAt(k) == letters.get(h)){

                    isTrue = true;
                    break;

                }else{

                    isTrue = false;

                }

            }
            if(isTrue == false){

                newAlph = newAlph + alph.charAt(k);

            }

        }
        while(scan.hasNextLine()){
            String str = scan.nextLine();

            if(str.length()<= word.length()) {
                for(int l = 0; l < str.length(); l++) {
                    for (int j = 0; j < newAlph.length(); j++) {

                        if (str.charAt(l) == newAlph.charAt(j)) {
                            counter++;
                            break;
                        }
                        if(counter > 0){

                            break;
                        }
                    }
                }
                if (counter == 0) {

                    System.out.println(str);
                    wordCount++;

                }
                counter = 0;
            }

        }
        System.out.println("\nNumber of words: " + wordCount);



    }
*/
    public void anagramCheat() { //FIGURE OUT HOW TO MAKE SCANNER RESET
        ArrayList<String> letter6 = new ArrayList<String>();
        ArrayList<String> letter5 = new ArrayList<String>();
        ArrayList<String> letter4 = new ArrayList<String>();
        ArrayList<String> letter3 = new ArrayList<String>();

        ArrayList<Character> letters = new ArrayList<Character>();
        ArrayList<Integer> compare = new ArrayList<>();
        Scanner scan2 = new Scanner(System.in);


        System.out.println("Please input the word:");
        String word = scan2.next();

        int i = 0;
        do {

            letters.add(word.charAt(i));
            compare.add(0);
            i++;

        } while (i < word.length());

        //while loop for 6

        Scanner scan6 = scan;
        while (scan6.hasNextLine()) {
            for (int t = 0; t < compare.size(); t++) {

                compare.set(t, 0);

            }

            String str = scan6.nextLine();
            boolean isTrue;

            switch (str.length()) {

                case 6:
                    isTrue = false;
                    if (str.length() == word.length()) {

                        for (int k = 0; k < letters.size(); k++) {

                            for (int j = 0; j < str.length(); j++) {

                                if (letters.get(j) == str.charAt(k)) {

                                    if (compare.get(j) == 1) {

                                        isTrue = false;
                                        break;

                                    }

                                    compare.set(j, compare.get(j) + 1);
                                    isTrue = true;
                                    break;

                                } else {

                                    isTrue = false;

                                }


                            }

                            if (isTrue == false) {

                                break;

                            }

                        }
                        if (isTrue == false) {

                            continue;

                        } else {

                            letter6.add(str);

                        }

                    }

                    break;

                case 5:

                    isTrue = false;
                    if (str.length() == word.length() - 1) {

                        for (int k = 0; k < str.length(); k++) {

                            for (int j = 0; j < letters.size(); j++) {

                                if (letters.get(j) == str.charAt(k)) {

                                    if (compare.get(j) == 1) {

                                        isTrue = false;
                                        break;

                                    }

                                    compare.set(j, compare.get(j) + 1);
                                    isTrue = true;
                                    break;

                                } else {

                                    isTrue = false;

                                }


                            }

                            if (isTrue == false) {

                                break;

                            }

                        }
                        if (isTrue == false) {

                            continue;

                        } else {

                            letter5.add(str);

                        }

                    }

                    break;

                case 4:

                    isTrue = false;
                    if (str.length() == word.length() - 2) {

                        for (int k = 0; k < str.length(); k++) {

                            for (int j = 0; j < letters.size(); j++) {

                                if (letters.get(j) == str.charAt(k)) {

                                    if (compare.get(j) == 1) {

                                        isTrue = false;
                                        break;

                                    }

                                    compare.set(j, compare.get(j) + 1);
                                    isTrue = true;
                                    break;

                                } else {

                                    isTrue = false;

                                }


                            }

                            if (isTrue == false) {

                                break;

                            }

                        }
                        if (isTrue == false) {

                            continue;

                        } else {

                            letter4.add(str);

                        }

                    }


                    break;

                case 3:

                    isTrue = false;
                    if (str.length() == word.length() - 3) {

                        for (int k = 0; k < str.length(); k++) {

                            for (int j = 0; j < letters.size(); j++) {

                                if (letters.get(j) == str.charAt(k)) {

                                    if (compare.get(j) == 1) {

                                        isTrue = false;
                                        break;

                                    }

                                    compare.set(j, compare.get(j) + 1);
                                    isTrue = true;
                                    break;

                                } else {

                                    isTrue = false;

                                }


                            }

                            if (isTrue == false) {

                                break;

                            }

                        }
                        if (isTrue == false) {

                            continue;

                        } else {

                            letter3.add(str);

                        }

                    }

                    break;

            }


        }

        //6 letter for loop
        System.out.println();
        System.out.println("6 Letter words:");
        for(int o = 0; o < letter6.size(); o++){

            System.out.println(letter6.get(o));

        }

        //5 letter for loop
        System.out.println();
        System.out.println("5 Letter words:");
        for(int o = 0; o < letter5.size(); o++){

            System.out.println(letter5.get(o));

        }

        //4 letter for loop
        System.out.println();
        System.out.println("4 Letter words:");
        for(int o = 0; o < letter4.size(); o++){

            System.out.println(letter4.get(o));

        }

        //3 letter for loop
        System.out.println();
        System.out.println("3 Letter words:");
        for(int o = 0; o < letter3.size(); o++){

            System.out.println(letter3.get(o));

        }



    }
}
