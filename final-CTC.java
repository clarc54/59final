//Christopher Clark
//CST112 Final
Lobster alpha, bravo, charlie, delta
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
  
}
void scene(){
  background(0,0,250);
  fill(0,255,0);
  rect(0,surface, width, height-surface);
  fill(204,204,0);
  ellipse(60,60,60,60);
  fill(0);
  text("Christopher Clark", height, width/2+150);
}

//Reset scene
void reset() {
//reset surface
surface= random(height/4, height/2);
//Lobsters
alpha= new Lobster("Alpha", width/2);
bravo= new Lobster("Bravo", width/4);
charlie= new Lobster("Charlie", width*1/4);
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
  float w=30,h=30;
  //legs
  int legs=10;
  String name="";
  // color
  float r,g,b;
  
  Lobster( String l, float x ) {
    this.name=  l;
    this.x=x;
    bottom();
    r=  random(100, 255);
    g=  random(0, 100);
    b=  random(100, 250);
  }
