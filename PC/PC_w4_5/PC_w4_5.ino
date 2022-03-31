const int ledPin=10;
const int buttonPin=2;
int ledValue=0;

void setup() {
  pinMode(buttonPin,INPUT);
}

void loop() {
  int buttonInput=digitalRead(buttonPin);
  if(buttonInput==HIGH){
    ledValue=min(ledValue+1, 255);
    }
    else{
    ledValue=max(ledValue-1,0);
  }

  analogWrite(ledPin, ledValue);
  delay(100);
  //digitalWrite(ledPin,buttonInput);
}
