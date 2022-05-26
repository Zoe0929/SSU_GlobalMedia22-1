const int LED=13;
const int PIR = 2;


void setup() {
  pinMode(LED,OUTPUT);
  pinMode(PIR, INPUT);
  Serial.begin(115200);
}

void loop() {
  int state=digitalRead(PIR);
  Serial.println(PIR);

  if(state==HIGH){
    digitalWrite(LED, HIGH);
  }
  else{
    digitalWrite(LED, LOW);
  }

}
