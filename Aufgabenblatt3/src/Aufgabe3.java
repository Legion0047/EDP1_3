/*
    Aufgabe 3) Zeichnen mit Schleifen und Methoden
*/
public class Aufgabe3 {
    
    private static void drawTriangle(double centerX, double centerY, double height, int direction) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }
    
    private static void drawTrianglePattern(double centerX, double centerY, int height, int centerShift) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }
    
    private static void drawTrianglePatternLine(double centerX, double centerY, int height, int growth, int distance) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }
    
    public static void main(String[] args) {
        
        int pixelWidth = 200;
        int pixelHeight = 200;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);
        
        //TODO: Testen Sie die Methoden ausführlich
        drawTriangle(100, 100, 20, 0);
        //drawTriangle(100, 100, 40, 1);
        //drawTriangle(100, 100, 30, 2);
        //drawTriangle(100, 100, 50, 3);
        StdDraw.pause(5000); //Wartezeit 5 Sekunden
        StdDraw.clear();
        
        drawTrianglePattern(100, 100, 50, 0);
        //drawTrianglePattern(100, 100, 40, 10);
        //drawTrianglePattern(100, 100, 20, 40);
        //drawTrianglePattern(100, 100, 10, 20);
        StdDraw.pause(5000);//Wartezeit 5 Sekunden
        StdDraw.clear();
        
        pixelWidth = 700;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);
        
        drawTrianglePatternLine(50, 100, 20, 5, 20);
        //drawTrianglePatternLine(50, 100, 10, 3, 10);
        //drawTrianglePatternLine(50, 100, 10, 10, 15);
    }
}


