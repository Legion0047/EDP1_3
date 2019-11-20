/*
    Aufgabe 3) Zeichnen mit Schleifen und Methoden
*/
import java.lang.*;

public class Aufgabe3 {
    
    private static void drawTriangle(double centerX, double centerY, double height, int direction) {
        double xCoords[] = new double[3];
        double yCoords[] = new double[3];
        xCoords[0] = centerX;
        yCoords[0] = centerY;
        switch (direction) {
            case 0: xCoords[1] = centerX+height;
                    yCoords[1] = centerY+height;
                    xCoords[2] = centerX+height;
                    yCoords[2] = centerY-height;
                    break;
            case 1: xCoords[1] = centerX-height;
                    yCoords[1] = centerY+height;
                    xCoords[2] = centerX+height;
                    yCoords[2] = centerY+height;
                    break;
            case 2: xCoords[1] = centerX-height;
                    yCoords[1] = centerY+height;
                    xCoords[2] = centerX-height;
                    yCoords[2] = centerY-height;
                    break;
            case 3: xCoords[1] = centerX+height;
                    yCoords[1] = centerY-height;
                    xCoords[2] = centerX-height;
                    yCoords[2] = centerY-height;
                    break;
        }
        StdDraw.polygon(xCoords,yCoords);
    }
    
    private static void drawTrianglePattern(double centerX, double centerY, int height, int centerShift) {
        for (int i = 0; i<4; i++){
            double xCoords[] = new double[3];
            double yCoords[] = new double[3];

            switch (i) {
                case 0: xCoords[0] = centerX+centerShift;
                        yCoords[0] = centerY;
                        xCoords[1] = centerX+height+centerShift;
                        yCoords[1] = centerY+height;
                        xCoords[2] = centerX+height+centerShift;
                        yCoords[2] = centerY-height;
                        break;
                case 1: xCoords[0] = centerX;
                        yCoords[0] = centerY+centerShift;
                        xCoords[1] = centerX-height;
                        yCoords[1] = centerY+height+centerShift;
                        xCoords[2] = centerX+height;
                        yCoords[2] = centerY+height+centerShift;
                        break;
                case 2: xCoords[0] = centerX-centerShift;
                        yCoords[0] = centerY;
                        xCoords[1] = centerX-height-centerShift;
                        yCoords[1] = centerY+height;
                        xCoords[2] = centerX-height-centerShift;
                        yCoords[2] = centerY-height;
                        break;
                case 3: xCoords[0] = centerX;
                        yCoords[0] = centerY-centerShift;
                        xCoords[1] = centerX+height;
                        yCoords[1] = centerY-height-centerShift;
                        xCoords[2] = centerX-height;
                        yCoords[2] = centerY-height-centerShift;
                        break;
            }
            StdDraw.polygon(xCoords,yCoords);
        }
    }
    
    private static void drawTrianglePatternLine(double centerX, double centerY, int height, int growth, int distance) {
        double lastGrowth = -growth;
        double lastDistance = -distance-(2*height);
        for (int i = 0; i<7;i++) {
            double currentGrowth = lastGrowth + growth;
            double currentDistance = lastDistance+distance+(2*height)+lastGrowth+currentGrowth;
            for (int j = 0; j < 4; j++) {
                double xCoords[] = new double[3];
                double yCoords[] = new double[3];

                switch (j) {
                    case 0:
                        xCoords[0] = centerX + currentDistance + currentGrowth;
                        yCoords[0] = centerY;
                        xCoords[1] = centerX + currentDistance + height + currentGrowth;
                        yCoords[1] = centerY + height;
                        xCoords[2] = centerX + currentDistance + height + currentGrowth;
                        yCoords[2] = centerY - height;
                        break;
                    case 1:
                        xCoords[0] = centerX + currentDistance;
                        yCoords[0] = centerY + currentGrowth;
                        xCoords[1] = centerX + currentDistance - height;
                        yCoords[1] = centerY + height + currentGrowth;
                        xCoords[2] = centerX + currentDistance + height;
                        yCoords[2] = centerY + height + currentGrowth;
                        break;
                    case 2:
                        xCoords[0] = centerX + currentDistance - currentGrowth;
                        yCoords[0] = centerY;
                        xCoords[1] = centerX + currentDistance - height - currentGrowth;
                        yCoords[1] = centerY + height;
                        xCoords[2] = centerX + currentDistance - height - currentGrowth;
                        yCoords[2] = centerY - height;
                        break;
                    case 3:
                        xCoords[0] = centerX + currentDistance;
                        yCoords[0] = centerY - currentGrowth;
                        xCoords[1] = centerX + currentDistance + height;
                        yCoords[1] = centerY - height - currentGrowth;
                        xCoords[2] = centerX + currentDistance - height;
                        yCoords[2] = centerY - height - currentGrowth;
                        break;
                }
                StdDraw.polygon(xCoords, yCoords);
                lastDistance = currentDistance;
                lastGrowth = currentGrowth;
            }
        }
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
        /*
        drawTriangle(100, 100, 20, 0);
        StdDraw.pause(5000); //Wartezeit 5 Sekunden
        StdDraw.clear();
        drawTriangle(100, 100, 40, 1);
        StdDraw.pause(5000); //Wartezeit 5 Sekunden
        StdDraw.clear();
        drawTriangle(100, 100, 30, 2);
        StdDraw.pause(5000); //Wartezeit 5 Sekunden
        StdDraw.clear();
        drawTriangle(100, 100, 50, 3);
        StdDraw.pause(5000); //Wartezeit 5 Sekunden
        StdDraw.clear();

        drawTrianglePattern(100, 100, 50, 0);
        StdDraw.pause(5000);//Wartezeit 5 Sekunden
        StdDraw.clear();
        drawTrianglePattern(100, 100, 40, 10);
        StdDraw.pause(5000);//Wartezeit 5 Sekunden
        StdDraw.clear();
        drawTrianglePattern(100, 100, 20, 40);
        StdDraw.pause(5000);//Wartezeit 5 Sekunden
        StdDraw.clear();
        drawTrianglePattern(100, 100, 10, 20);
        StdDraw.pause(5000);//Wartezeit 5 Sekunden
        StdDraw.clear();

         */
        pixelWidth = 700;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);


        drawTrianglePatternLine(50, 100, 20, 5, 20);
        StdDraw.pause(5000);//Wartezeit 5 Sekunden
        StdDraw.clear();
        drawTrianglePatternLine(50, 100, 10, 3, 10);
        StdDraw.pause(5000);//Wartezeit 5 Sekunden
        StdDraw.clear();
        drawTrianglePatternLine(50, 100, 10, 10, 15);
        StdDraw.pause(5000);//Wartezeit 5 Sekunden
        StdDraw.clear();

    }
}


