package be.intecbrussel.graphic;

import java.util.Iterator;

public class DrawingApp {
   public static void main(String[] args) {
      Drawing drawing = new Drawing();
      drawing.add(new Rectangle(5, 6));
      drawing.add(new Square(5));
      for (int i = 0; i < 10; i++) {
         drawing.add(new Circle(i));
      }
      //iterate using foreach
      System.out.println("printing all shapes in drawing");
      for(Object o : drawing) {
    	  System.out.println(o.toString());
      }
      //iterate using while loop
//      Iterator iterator = drawing.iterator();
//      while(iterator.hasNext()) {
//    	  Object o = iterator.next();
//    	  System.out.println(o.toString());
//    	  }
      Drawing drawing2 = new Drawing();
      copyDrawing(drawing, drawing2);
      
      System.out.println("printing all shapes in drawing2");
      for(Object o : drawing2) {
    	  System.out.println(o.toString());
      }
  
      
   }

private static void copyDrawing(Drawing drawing, Drawing drawing2) {
	for(Object o: drawing) {
		drawing2.add((Drawable)o);
	}
	
}
}
