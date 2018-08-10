/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework8myway;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ryanprice
 */
public class HomeWork8MyWay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Vector wordVector = new Vector();
        Set<String> stopWords = new HashSet();
        fillStopWordSet(stopWords);

        while(true){
            System.out.print("> ");
            String command = input.readLine().toLowerCase();
            if(command.equals("help")){
                printMenu();
            }
            
            else if(command.equals("quit")){
                System.exit(0);
            }
           
            else if (command.contains("index")){
                if(command.length()>6){ //find file name
                    String fileName = command.substring(7);
                    indexing(fileName);
                }
                else{
                    indexing();
                }
            }

            else if(command.equals("vectors")){
                
            }

            else if(command.equals("sentences")){
            }
 
            else{
                
                System.out.println("Please enter a command: enter help for "
            + "list of commands");
            
            }
            
            
        }
    }

    private static void printMenu() {
        System.out.println("Supported Commands:");
        System.out.println("Help");
        System.out.println("-Prints a menu");
        System.out.println("Index");
        System.out.println("-Creats an index of the input file");
        System.out.println("Vectors");
        System.out.println("-Prints the created vectors");
        System.out.println("Sentences");
        System.out.println("-Prints the sentences and total number of sentences");
        System.out.println("Quit");
        System.out.println("-Exits the program");
    
    }

    private static void fillStopWordSet(Set<String> stopWords) throws FileNotFoundException {
        String stopWordsList = "../stopwords.txt";
        Scanner sw = new Scanner(new File(stopWordsList));
        while (sw.hasNext()) {
            stopWords.add(sw.next());
        }
    }

    private static void indexing() throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a file name");
        String fileName = input.readLine();
        System.out.println("Indexing "+fileName);
    }

    private static void indexing(String fileName) {
        System.out.println("Indexing " + fileName);
    }


    
}
