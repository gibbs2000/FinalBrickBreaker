/**
*Patrick and Sean
*5/20/17
*This class represents the bricks on the board
*
*
*/

import java.awt.*;
import java.util.Arrays;

public class Bricks{
   //represents the bricks on the board in a 2D array
   static Brick[][] bs = new Brick[GameConstants.NUM_ROWS][GameConstants.NUM_BRICKS];
   
   public Bricks(){
     
      Color c = Color.RED;
      //fills the 2D array with the brick and of the correct color
      for(int i = 0; i< GameConstants.NUM_ROWS; i++){
         for(int j = 0; j < (GameConstants.WINDOW_SIZE-50)/GameConstants.BRICK_WIDTH; j++){
            if(i<6)
               c = GameConstants.COLORS[i];
            else
               c = GameConstants.COLORS[i-6];
           
            Brick b = new Brick(j,i,c);
            bs[i][j] = b; 
         }
      }
   }
   //paints the bricks brick by brick in order
   public void paint(Graphics g){
      for(Brick[] row: bs){
         for(Brick b: row){
            b.paint(g);
         }
      }            
   }
   
   public String toString(){
      for(Brick[] row: bs){
         for(Brick b: row){
            System.out.println(b);
         }
      }
      return "";
   }
   

}