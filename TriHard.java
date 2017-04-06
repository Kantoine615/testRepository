import objectdraw.*;
import java.awt.*;


public class TriHard

                    extends ActiveObject{
  private Line l1,l2,l3;
  private double v1p1,v2p1,v1p2,v2p2,v1p3,v2p3;
  private Location p1,p2,p3;

  public TriHard(Location p1, Location p2, Location p3,int _v1, int _v2, Color C,
                 DrawingCanvas dc){
  
    v1p1= _v1;
    v2p1= _v2;
    v1p2= _v1;
    v2p2= _v2;
    v1p3= _v1;
    v2p3= _v2;

    l1=new Line(p1,p2, dc);
    l2=new Line(p2,p3, dc);
    l3=new Line(p3,p1, dc);
    l1.setColor(C);
    l2.setColor(C);
    l3.setColor(C);
    
   

    start();
  }
    

    
 // public Trihard(Location p1, Location p2, Location p3,int v1x, int v2, Color C,
                // DrawingCanvas dc

  

  //additional methods

  public void run(){
    
    while (true){
      double p1Xnext =l1.getStart().getX()+v1p1;
      double p2Xnext =l2.getStart().getX()+v1p2;
      double p3Xnext =l3.getStart().getX()+v1p3;
      double p1Ynext =l1.getStart().getY()+v2p1;
      double p2Ynext =l2.getStart().getY()+v2p2;
      double p3Ynext =l3.getStart().getY()+v2p3;
      double p4Xnext =l1.getEnd().getX()+v1p1;
      double p5Xnext =l2.getEnd().getX()+v1p2;
      double p6Xnext =l3.getEnd().getX()+v1p3;
      double p4Ynext =l1.getEnd().getY()+v2p1;
      double p5Ynext =l2.getEnd().getY()+v2p2;
      double p6Ynext =l3.getEnd().getY()+v2p3;

      if (p1Xnext > l1.getCanvas().getWidth()){
         v1p1=-v1p1;   
      }
      if (p1Xnext< 0){
         v1p1=-v1p1;
         
      }
      if (p1Ynext > l1.getCanvas().getHeight()){
         v2p1=-v2p1;
         
      }
      if (p1Ynext< 0){
         v2p1=-v2p1;
      }
      if (p2Xnext > l1.getCanvas().getWidth()){
         v1p2=-v1p2;   
      }
      if (p2Xnext< 0){
         v1p2=-v1p2;
         
      }
      if (p2Ynext > l1.getCanvas().getHeight()){
         v2p2=-v2p2;
         
      }
      if (p2Ynext< 0){
         v2p2=-v2p2;
         
      }
      if (p3Xnext > l1.getCanvas().getWidth()){
         v1p3=-v1p3;   
      }
      if (p3Xnext< 0){
         v1p3=-v1p3;
         
      }
      if (p3Ynext > l1.getCanvas().getHeight()){
         v2p3=-v2p3;
         
      }
      if (p3Ynext< 0){
         v2p3=-v2p3;
      }
      l1.setStart(l1.getStart().getX()+v1p1, l1.getStart().getY()+v2p1);
      l2.setStart(l2.getStart().getX()+v1p2, l2.getStart().getY()+v2p2);
      l3.setStart(l3.getStart().getX()+v1p3, l3.getStart().getY()+v2p3);
      l1.setEnd(l3.getStart());
      l2.setEnd(l1.getStart());
      l3.setEnd(l2.getStart());
      pause(10);
      
     
    
  }
}
}

