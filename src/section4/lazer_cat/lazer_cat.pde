PImage catPic;
int x = 300;
int y = 160;
void setup(){
  size(500,500);
  catPic = loadImage("cute-cat-eyes.jpg");
  catPic.resize(500, 500);
  background(catPic);
  noStroke();
}
void draw(){
  if(mousePressed){
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
  }
 fill(270,5 ,100);
 ellipse(x, y, 80, 75);
 ellipse(x-130, y, 70, 70);

}
void keyPressed(){
x=x-5; 
y =y-5;
}