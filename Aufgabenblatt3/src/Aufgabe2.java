/*
    Aufgabe 2) Überladen von Methoden
*/
import java.lang.*;

public class Aufgabe2 {

    public static void addTags(String text) {
        int split;
        if(text.length()%2==0){
            split = text.length()/2;
        } else {
            split = (text.length()/2)+1;
        }
        String textFirst = "X"+text.substring(0,split)+"X";
        String textSecond = ""+text.substring(split,text.length())+"X";
        System.out.println(textFirst+textSecond);
    }

    public static void addTags(String text, char tag) {
        int split;
        if(text.length()%2==0){
            split = text.length()/2;
        } else {
            split = (text.length()/2)+1;
        }
        String textFirst = ""+tag+text.substring(0,split)+tag;
        String textSecond = ""+text.substring(split,text.length())+tag;
        System.out.println(textFirst+textSecond);
    }
    
    public static void addTags(int number, char tag) {
        int length = (int)(Math.log10(number)+1);
        int split;
        if(length%2==0){
            split = length/2-1;
        } else {
            split = length/2;
        }
        String result = ""+tag;
        int temp = number;
        for (int i = 0; i<length-1;i++){
            temp = temp % (int) Math.pow(10, (int) Math.log10(temp));
            int digit = number-temp;
            while (digit>=10) digit = digit/10;
            result = result+digit;
            if (i == split) result = result+tag;
        }
        result = result+temp+tag;
        if (length==1) result = result+tag;
        System.out.println(result);
    }
    
    public static void addTags(String text, String tags) {
        for (int i = 0; i<tags.length();i++){
            addTags(text, tags.charAt(i));
        }
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

        addTags(text3);
    }
}
