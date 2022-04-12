//조도센서 아날로그값 

const int analogPin = A0;
//const int ledPin =10; 

void setup() {
  Serial.begin(115200);
}

void loop() {
  int analogValue = analogRead(analogPin);
  Serial.println(analogValue);
}
