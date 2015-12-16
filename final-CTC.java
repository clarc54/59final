//Christopher Clark
//CST112 Final

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
  background(0,0,250);
  fill(0,255,0);
  rect(0,surface, width, height-surface);
  fill(204,204,0);
  ellipse(60,60,60,60);
  fill(0);
  text("Christopher Clark", height, width/2+150);
}

//Reset scene key
void keyPressed() {
  if (key == 'r') reset();
}
