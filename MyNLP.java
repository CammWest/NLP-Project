import java.util.ArrayList;
import java.util.Scanner;

public class MyNLP {

  // Instance Variables
  private ArrayList<String> englishWords;
  private ArrayList<String> armenianWords;
  

  // Constructor
  public MyNLP() {
    createEnglishArmenianWordList();
  }

  /*
  / Creates 2 different array lists:
  / One for English words and the other for Armenian
  */
  
  public void createEnglishArmenianWordList() {
    ArrayList<String> text = FileReader.toStringList("English2Armenian.txt");
    englishWords = new ArrayList<String>();
    armenianWords = new ArrayList<String>();

    // 1. Traverse the text ArrayList
    for (String line : text) {
      String[] words = line.split(", ");
      englishWords.add(words[0]); // english
      armenianWords.add(words[1]); // armenian
    }

  }

  /*
  / Translate the users input and changes it to Armenian
  */
  
  private String translateWord(String word) {
    
    
    for (int i = 0; i < englishWords.size(); i++) {
      String eng = englishWords.get(i);
      
      if (word.equals(eng)) {
        
        
        return armenianWords.get(i);
      }
    }

    return "No translation available";
  }


  /*
  / Transforms the user input into an ArrayList called wordList
  */
  public ArrayList<String> userSentenceToWords(String sentence) {
    ArrayList<String> wordList = new ArrayList<String>();
    String[] words = sentence.split(" ");
    
    for (int i = 0; i < words.length; i++) {
      wordList.add(words[i]);
    }
    
    return wordList;
  }

  private void translate() {
    Scanner input = new Scanner(System.in);
    //Tells the user to type a sentnence
    System.out.println("Type a sentence to convert to Armenian:");
    String userSentence = input.nextLine();
    ArrayList<String> words = userSentenceToWords(userSentence);

    String result = "";
    for (String w : words) {
      result += translateWord(w) + " ";
    }
    
    // System.out.println(words);
    System.out.println(result);

    input.close();
  }

  /*
  / Starts a scanner method that asks for the user input which is then converted to armenian
  */
  public void prompt(){
    Scanner input = new Scanner(System.in);
    
    translate();
    boolean userSaidNo = false;

    while(!userSaidNo) {
      // Asks the user if they want to translate another sentence or not
      System.out.println("Would you like to translate another sentence? Choose an option:");
      System.out.println("1. Yes");
      System.out.println("2. No");
      String userInput = input.nextLine();
      // assign user Input 
      // Logic for userInput
      if (userInput.equals("1")) {
        translate();
        //ends the program
      } else if (userInput.equals ("2")) { 
        userSaidNo = true;
      } else { 
        // Error Handling
        System. out. println("\nSorry, I dont understand that."); 
        System. out. println("Please restart, and only choose option 1 or 2");
      }
    }
    System.out.println("Goodbye!");

    
  }
  
  
}