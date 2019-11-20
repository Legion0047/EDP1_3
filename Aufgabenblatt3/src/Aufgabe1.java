/*
    Aufgabe 1) Codeanalyse, Codingstyle und Methoden
*/
public class Aufgabe1 {

    public static String alphabetically (String s){
        for(int i = 0; i<s.length();i++){
            for(int j = 0; j<s.length()-i-1;j++){
                if(s.charAt(j)>=s.charAt(j+1)){
                    String temp = s;
                    String before = temp.substring(0,j);
                    String switched = ""+temp.charAt(j+1)+temp.charAt(j);
                    String after = temp.substring(j+2,temp.length());
                    s = ""+before+switched+after;
                }
            }
        }
        return s;
    }

    /**
     * This method orders all characters in a string alphabetically
     * @param s String
     * @return String
     */
    public static String alphabeticallyOld(String s) {
        
        int n = stringLength(s);
        for (int i = 1; i < n; i = incementInt(i)) {
            char k = s.charAt(i);
            int j = decrementInt(i);
            while (greaterThenInt(j, 0) && greaterThenChar(s.charAt(j), k)) {
                j = decrementInt(j);
            }
            j = incementInt(j);
            s = subString(s, 0, j) + k + subString(s, j, i) + subString(s, i + 1, s.length());
        }
        return s;
    }
    /**
     * This method return the length of the String passed in the parameter s
     * @param s String
     * @return int
     */
    public static int stringLength(String s) {
        return s.length();
    }
    /**
     * This method increments the passed integer by 1
     * @param n int
     * @return int
     */
    public static int incementInt(int n) {
        return n + 1;
    }

    /**
     * This method decrements the passed integer by 1
     * @param n int
     * @return int
     */
    public static int decrementInt(int n) {
        return n - 1;
    }

    /**
     * This method return the bool value true, if n1 is equals or greater n2 and false if n1 is lower that n2
     * @param n1 int
     * @param n2 int
     * @return boolean
     */
    public static boolean greaterThenInt(int n1, int n2) {
        return n1 >= n2;
    }

    /**
     * This method compares the chars c1 and c2, returning true if c1 is greater or equals c2 and false if not.
     * @param c1
     * @param c2
     * @return
     */
    public static boolean greaterThenChar(char c1, char c2) {
        return c1 >= c2;
    }

    /**
     * This method return the substring from s, from the character with the index n1 to the character number n2.
     * @param s String
     * @param n1 int
     * @param n2 int
     * @return String
     */
    public static String subString(String s, int n1, int n2) {
        return s.substring(n1, n2);
    }
    
    public static void main(String args[]) {
        System.out.println(alphabetically("ab"));
        System.out.println(alphabetically("ba"));
        System.out.println(alphabetically("aa"));
        System.out.println(alphabetically("cba"));
        System.out.println(alphabetically("abababab"));
        System.out.println(alphabetically("abcfghed"));
        System.out.println(alphabetically("abnasnasab"));
        System.out.println(alphabetically("najskaghkkjsfvjhbavbdfsan"));
        System.out.println(alphabetically("jgbgdsjabkjdbvbdjabkjsavbkjbdsvkjbagfgafjdbv"));

        assert (alphabetically("ab").equals("ab"));
        assert (alphabetically("ba").equals("ab"));
        assert (alphabetically("aa").equals("aa"));
        assert (alphabetically("cba").equals("abc"));
        assert (alphabetically("abababab").equals("aaaabbbb"));
        assert (alphabetically("abcfghed").equals("abcdefgh"));
        assert (alphabetically("abnasnasab").equals("aaaabbnnss"));
        assert (alphabetically("najskaghkkjsfvjhbavbdfsan").equals("aaaabbdffghhjjjkkknnsssvv"));
        assert (alphabetically("jgbgdsjabkjdbvbdjabkjsavbkjbdsvkjbagfgafjdbv").equals("aaaaabbbbbbbbbdddddffggggjjjjjjjjkkkksssvvvv"));
    }
}



