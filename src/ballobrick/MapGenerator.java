package ballobrick;

import java.awt.BasicStroke;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.Graphics2D;

public class MapGenerator {
       public int map[][];
       public int brickWidth;
       public int brickHeight;
       public MapGenerator(int rows, int col){
           map = new int[rows][col];
           for(int i=0;i<map.length;i++)
           {
               for(int j=0;j<map[0].length;j++)
               {
                   map[i][j]=1;
               }
           }
           brickWidth=540/col;
           brickHeight=150/rows;
           
       }
    public void draw(Graphics2D g){
        for(int i=0;i<map.length;i++)
           {
               for(int j=0;j<map[0].length;j++)
               {
                   if(map[i][j]>0){
                       g.setColor(white);
                       g.fillRect(j*brickWidth+80,i*brickHeight+50,brickWidth,brickHeight);
                       g.setStroke(new BasicStroke(3));
                       g.setColor(Color.black);
                       g.drawRect(j*brickWidth+80,i*brickHeight+50,brickWidth,brickHeight);
                   }
               }
           }
    }
    public void setBasicVAlue(int value,int row,int col){
            map[row][col] = value;
    }
    }
}   
       
