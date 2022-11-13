package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {

    int x_pos = 300;
    int y_pos = 800;
    int hop_Distance = 50;
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP && y_pos>0)
            {
            y_pos= y_pos-50;
            }
            else if(keyCode == DOWN && y_pos<801)
            {
            y_pos= y_pos+50;
            }
            else if(keyCode == RIGHT && x_pos<601)
            {
            x_pos= x_pos+50;
            }
            else if(keyCode == LEFT && x_pos>0)
            {
            x_pos= x_pos-50;
            }
        }
    }
    
    @Override
    public void settings() {
        size(600, 800);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    background(21,42,84);
    fill(69, 220, 59);
    ellipse(x_pos, y_pos, 50, 50);
    fill(200, 50, 59);
    rect(100,600, 200,100);
    rect(400,400, 200,100);
    rect(50,300, 200,100);
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    
 
    }
    

