const int ledPin=10;
const int buttonPin=2;

void setup() {
  pinMode(buttonPin,INPUT);
}

void loop() {
  int buttonInput=digitalRead(buttonPin);
  if(buttonInput==HIGH){
    for(int t_high=0; t_high<=255;t_high++){
      analogWrite(ledPin,t_high);
      delay(4);
    }
  }
  else{
    analogWrite(ledPin,0);
  }
  //digitalWrite(ledPin,buttonInput);
}
