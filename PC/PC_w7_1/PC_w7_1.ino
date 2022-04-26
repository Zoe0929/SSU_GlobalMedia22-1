const int trigPin=11;
const int echoPin=12;

void setup() {
  pinMode(trigPin,OUTPUT);
  pinMode(echoPin,INPUT);
  Serial.begin(115200);

}

void loop() {
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin,HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin,LOW);

  unsigned long duration=pulseIn(echoPin,HIGH);
  float distance=duration/58.f;

  Serial.print(distance,2);
  Serial.println("cm");
}
