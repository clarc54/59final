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
  rect(0,surface, width, height-surface);
  fill(204,204,0);
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
  //Constructors
  Lobster( String s, float x ) {
    this.name=  s;
    this.x=x;
    bottom();
    r=  random(100, 255);
    g=  random(0, 100);
    b=  random(100, 250);
  }
  
  void move(){
   x += dx;
    y += dy;
    if (y<surface) {
      bottom();
     }
  }

  //Display lobsters: alpha, bravo, charlie, delta
  void show {
    fill(r,g,b);
    stroke(r,g,b);
    ellipse( x,y, w,h );         // round top
    rect( x-w/2,y, w,h/2 );      // flat bottom
    fill(255);
    float blink=10;
    if ( y%100 > 80) blink=2;
    ellipse( x,y-h/4, 10, blink );     // eye
    // Legs
    fill(r,g,b);                 // legs.
    float legX=  x-w/2, foot=0;
    if (dy<0) {
      foot=5;
      if (y%50 > 25) foot=  -foot;
      //--  if (frameCount/30 %  2 > 0) foot=  -foot;
    }
    for (int i=0; i<legs; i++) {
      line( legX, y+h/2, legX+foot, 20+y+h/2 );
      legX += w / (legs-1);
    }
    fill(200,200,0);
    //  text( name+"("+legs+")", x-w/2, y-20 );
    text( name, x-w/2, y+h/2 );
    }
}
