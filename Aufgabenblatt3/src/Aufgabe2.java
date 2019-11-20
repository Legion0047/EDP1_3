/*
    Aufgabe 2) Überladen von Methoden
*/
public class Aufgabe2 {
    
    public static void addTags(String text, char tag) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }
    
    public static void addTags(int number, char tag) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }
    
    public static void addTags(String text, String tags) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }
    
    public static void main(String[] args) {
        String text0 = "A";
        String text1 = "AB";
        String text2 = "Hello World!";//12
        String text3 = "Java-Programmierung";//19
        String text4 = "Das ist ein Test";//16
        
        addTags(text0, '?');
        addTags(text1, ',');
        addTags(text2, ':');
        addTags(text3, '+');
        addTags(text4, '-');
        
        addTags(1, '$');
        addTags(35, '*');
        addTags(2048, '#');
        addTags(657, ':');
        addTags(26348, '+');
        
        addTags(text2, "+#$");
        addTags(text3, ":*&!");
    }
}
