#include<TimerOne.h>

const int trigPin=11;
const int echoPin=12;
const int BUZZER =10;

void setup() {
  pinMode(trigPin,OUTPUT);
  pinMode(echoPin,INPUT);
  Serial.begin(115200);
  Timer1.initialize();
   Timer1.pwm(BUZZER,0);
}

void loop() {
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin,HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin,LOW);

  Timer1.setPwmDuty(BUZZER,512);
  
  unsigned long duration=pulseIn(echoPin,HIGH);
  float distance=duration/58.f;
  Serial.println(distance);
  if(distance<100){
    Timer1.setPeriod(1000000/262);
    delay(100);
    Timer1.setPeriod(1000000/294);
    delay(100);
  }
  else {
    Timer1.setPeriod(0);
  }

  Timer1.setPwmDuty(BUZZER,0);
  delay(10);
}
