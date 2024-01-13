import java.util.Scanner;

public class KeypadCombination {
    
    /*
     * Write a program to find the letter combination of phone keypad. We all have seen the
     * keypad on phones where each number is associated with the different alphabets.
     * 2(ABC), 3(DEF), 4(GHI), 5(JKL), 6(MNO), 7(PQRS), 8(TUV), 9(WXYZ)
     * (where as 0 and 1 can be ignored)
     * 
     * Now if you are given a string then print all the letter combinations that is possible
     * with the key pressed.
     * 
     * Example str = "846"
     * O/P = TGM,TGN,TGO,THM,THN,THO,TIM,TIN,TIO,UGM,UGN,UGO,UHM,UHN,UHO,UIM,UIN,UIO,VGM,VGN,VGO,VHM,VHN,VHO,VIM,VIN,VIO
    */

    /*
     * We can break this problem into small sub-problems, suppose for the given input 846 instead of finding
     * it's letter combination, we'll try to find the letter combination of 46 and to find it's letter combination
     * we'll find the letter combination of 6 and then call our function recursively to get all the combinations.
     * 
     * str                  ans(different combinations)
     * 6(MNO)               M,N,O
     * 46(GHIMNO)           GM,GN,GO
     *                      HM,HN,HO
     *                      IM,IN,IO
     * 846(TUVGHIMNO)       TGM,TGN,TGO,THM,THN,THO,TIM,TIN,TIO,
     *                      UGM,UGN,UGO,UHM,UHN,UHO,UIM,UIN,UIO,
     *                      VGM,VGN,VGO,VHM,VHN,VHO,VIM,VIN,VIO
     * 
     * 
     * Base Confition = if(str.length() == 0)
    */

    //We'll represent all the number keypad with respect to array index.
    //                          0  1   2      3      4      5      6      7       8       9
    static String keypad [] = {"","","ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

    static void  possibleWords(String str, String ans){

        if(str.length() == 0){
            System.out.print(ans + ",");
            return;
        }

        String key = keypad[str.charAt(0)-48]; //to convert String 8 to Decimal 8

        for(int i = 0; i < key.length(); i++){
            possibleWords(str.substring(1), ans + key.charAt(i));
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Keypad Buttons: ");
		String str = sc.next();

        System.out.println("Possible words with the pressed keypad " + str + " is : ");
        possibleWords(str, "");

        sc.close();
    }



}
