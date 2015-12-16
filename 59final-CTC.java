//Christopher Clark
//CST112 Final
Lobster alpha, bravo, charlie, delta;
float surface;

//Setup
void setup(){
  size(640,480);
  surface= random(height/4, height/2);
  reset();
}

//Scene
void draw(){
  scene();
  action();
  show();
  
}
void scene(){
  background(0,0,250);
  fill(0,255,0);
  stroke(0,255,0);
  rect(0,surface, width, height-surface);
  fill(255,255,0);
  stroke(255,255,0);
  ellipse(60,60,60,60);
  fill(0);
  text("Christopher Clark", height, width/2+150);
}
void action(){
  alpha.move();
  bravo.move();
  charlie.move();
  delta.move();
}
void show(){
  alpha.show(); 
  bravo.show(); 
  charlie.show();
  delta.show();
}

//Reset scene
void reset() {
//reset surface
surface= random(height/4, height/2);
//Lobsters
alpha= new Lobster("Alpha", width/3);
bravo= new Lobster("Bravo", width/2);
charlie= new Lobster("Charlie", width*1/8);
delta= new Lobster( "Delta", width *3/4);
}


//Reset scene key
void keyPressed() {
  if (key == 'r') reset();
}

//Lobster class
class Lobster {
  // Coordinates
  float x,y;
  // Speed
  float dx=0,dy=0;
  float w=50,h=30;
  String name="";
  // color
  float r,g,b;
  //Constructors
  Lobster( String l, float x ) {
    this.name=  l;
    this.x=x;
    bottom();
    r=  random(125, 255);
    g=  random(0,0);
    b=  random(0,0);
  }
  void bottom() {
    y=  height - h*2;
    dy=  -random( 0.1, 0.9 );
  }
  
  void move(){
   x += dx;
    y += dy;
    if (y<surface) {
     bottom();
     }
  }

  //Display lobsters: alpha, bravo, charlie, delta
  void show() {
    fill(r,g,b);
    stroke(r,g,b);
    //ellipse( x,y, w,h ); 
    ellipse(x,y,w,h);
    rect(x-5,y-5,50,5);
    rect(x+5,y+5,40,5);
    fill(r,g,b);
    text( name, x-w, y+h );
    }
}
