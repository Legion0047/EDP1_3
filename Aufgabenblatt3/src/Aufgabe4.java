/*
    Aufgabe 4) Rekursion
*/
public class Aufgabe4 {
    
    private static void printNumbersAscending(int start, int end, int divider) {
        if(start%divider==0) System.out.println(start);
        if(start !=end) {
            printNumbersAscending(start+1,end,divider);
        }
    }
    
    private static void printNumbersDescending(int start, int end, int divider) {
        if(end%divider==0) System.out.println(end);
        if(start !=end) {
            printNumbersDescending(start,end-1,divider);
        }
    }
    
    private static int calcDigitProduct(int number) {
        String temp = "" + number;
        int digit = Integer.parseInt(temp.substring(0,1));
        if (digit==0) digit=1;
        if(temp.length()>1) {
            int rest = Integer.parseInt(temp.substring(1));
            return digit * calcDigitProduct(rest);
        } else {
            return digit;
        }
    }
    
    private static String filterNumbersInString(String text) {
        if (text.length()>1) {
            String myPart = text.substring(0, 1);
            String nextPart = text.substring(1);
            if (myPart.equals("0") || myPart.equals("1") || myPart.equals("2") || myPart.equals("3") || myPart.equals("4") || myPart.equals("5") || myPart.equals("6") || myPart.equals("7") || myPart.equals("8") || myPart.equals("9"))
                myPart = "";
            return myPart + filterNumbersInString(nextPart);
        } else {
            if (text.equals("0") || text.equals("1") || text.equals("2") || text.equals("3") || text.equals("4") || text.equals("5") || text.equals("6") || text.equals("7") || text.equals("8") || text.equals("9"))
                text = "";
            return text;
        }
    }
    
    private static String reverseStringDoubleLetter(String text, char letter) {
        if(text.length()>1) {
            String myPart = text.substring(text.length()-1);
            String nextPart = text.substring(0, text.length()-1);
            if (myPart.equals(""+letter)){
                return myPart + letter + reverseStringDoubleLetter(nextPart, letter);
            } else {
                return myPart + reverseStringDoubleLetter(nextPart, letter);
            }
        } else {
            if (text.equals(""+letter)) text = text + letter;
            return text;
        }
    }
    
    public static void main(String[] args) {

        printNumbersAscending(10, 20, 2);
        System.out.println();
        printNumbersDescending(5, 15, 3);
        System.out.println();


        System.out.println(calcDigitProduct(1));
        System.out.println(calcDigitProduct(102));
        System.out.println(calcDigitProduct(1234));
        System.out.println(calcDigitProduct(10000));
        System.out.println(calcDigitProduct(93842));
        System.out.println(calcDigitProduct(875943789));
        assert (calcDigitProduct(1) == 1);
        assert (calcDigitProduct(102) == 2);
        assert (calcDigitProduct(1234) == 24);
        assert (calcDigitProduct(10000) == 1);
        assert (calcDigitProduct(93842) == 1728);
        assert (calcDigitProduct(875943789) == 15240960);
        System.out.println();

        System.out.println(filterNumbersInString("hallo"));
        System.out.println(filterNumbersInString("Test 1 mit 45 Punkten!"));
        System.out.println(filterNumbersInString("1A1234567890B0"));
        assert(filterNumbersInString("hallo").equals("hallo"));
        assert(filterNumbersInString("Test 1 mit 45 Punkten!").equals("Test  mit  Punkten!"));
        assert(filterNumbersInString("1A1234567890B0").equals("AB"));
        assert(filterNumbersInString("a1b2c3d4e5").equals("abcde"));
        assert(filterNumbersInString("").equals(""));
        System.out.println();
    
        System.out.println(reverseStringDoubleLetter("X", 'X'));
        System.out.println(reverseStringDoubleLetter("Hallo", 'l'));
        System.out.println(reverseStringDoubleLetter("String umdrehen!", 'z'));
        assert(reverseStringDoubleLetter("X", 'X').equals("XX"));
        assert(reverseStringDoubleLetter("Hallo", 'l').equals("ollllaH"));
        assert(reverseStringDoubleLetter("String umdrehen!", 'z').equals("!neherdmu gnirtS"));
        assert(reverseStringDoubleLetter("ABACADAFA", 'A').equals("AAFAADAACAABAA"));
        assert(reverseStringDoubleLetter("", 'A').equals(""));

    }
}


