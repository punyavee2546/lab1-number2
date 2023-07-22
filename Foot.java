import java.util.Scanner;

public class Foot {
    public void draw() {
        FootShape s = new FootShape();
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        switch(type) {
            case 1 -> s.drawAsEllipse();
            case 2 -> s.drawAsRectangle();  
        }
        System.out.println(s.shape);
    }
   
    public static void main(String [] args){
       Foot f = new Foot();
       f.draw();
    }
}