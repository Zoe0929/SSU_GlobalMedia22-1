const int analogPin = A0;
const int ledPin =10;

void setup() {
  Serial.begin(115200);
}

void loop() {
  int analogValue = analogRead(analogPin);
  analogWrite(ledPin,analogValue/4);
}
