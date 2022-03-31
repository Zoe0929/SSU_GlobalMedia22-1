
const int LED =13;

void setup() {
  pinMode(LED,OUTPUT);
}

void loop() {
  for(int t=0;t<=10;t++){
    digitalWrite(LED,HIGH);
    delay(t);
    digitalWrite(LED,LOW);
    delay(10-t);  
  }
}
