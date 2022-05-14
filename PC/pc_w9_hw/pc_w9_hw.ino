#include "PinChangeInterrupt.h"

const int LED[6] = {2, 3, 4, 5, 6, 7};

const int trigPin = 11;
const int echoPin = 12;




volatile unsigned long echo_duration = 0;
void echoIsr(void) {
  static unsigned long echo_begin = 0;
  static unsigned long echo_end = 0;

  unsigned int echo_pin_state = digitalRead(echoPin);
  if (echo_pin_state == HIGH) {
    echo_begin = micros();
  } 
  else {
    echo_end = micros();
    echo_duration = echo_end - echo_begin;
  }
}


void setup()
{
  for (int i = 0; i < 6; i++) {
    pinMode(LED[i], OUTPUT);
  }
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);

  Serial.begin(115200);

  attachPCINT(digitalPinToPCINT(echoPin), echoIsr, CHANGE);
}

void loop()
{
   if (echo_duration == 0) {
    digitalWrite(trigPin, LOW);
    delayMicroseconds(2);
    digitalWrite(trigPin, HIGH);
    delayMicroseconds(10);
    digitalWrite(trigPin, LOW);
  } 
  else {
    unsigned long distance = echo_duration / 58;
    Serial.print(distance);
    Serial.println(" cm");
    echo_duration = 0;  for (int i = 0; i < 6; i++) {
    if ((60.f - distance) / 10.f >= i)
      digitalWrite(LED[i], HIGH);
    else
      digitalWrite(LED[i], LOW);
  }
  }

}
