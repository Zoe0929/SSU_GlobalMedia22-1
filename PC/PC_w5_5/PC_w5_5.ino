const int Xin =A0;
const int Yin=A1;
const int KEYin = 3;
const unsigned int led[4]={6,9,10,11};

void setup() {
  pinMode(KEYin,INPUT_PULLUP);
  Serial.begin(115200);
}

void loop() {
  int xVal = analogRead(Xin);
  int yVal = analogRead(Yin);
  int buttonVal = digitalRead(KEYin);

  if(xVal>0){
    digitalWrite(led[0],HIGH);
  }
  
  if(xVal>200){
    digitalWrite(led[1],HIGH);
  }
  
  if(yVal>0){
    digitalWrite(led[2],HIGH);
  }
  
  if(yVal>0){
    digitalWrite(led[3],HIGH);
  }
  else{
  
}
