#include <Stepper.h>
#include <DHT.h>

#define STEPS 2048

unsigned int curTime=millis();

Stepper stepper(STEPS, 8, 10, 9, 11);
DHT dht(A0, DHT11);

void setup() {
  Serial.begin(115200);
  dht.begin();
  stepper.setSpeed(15);
}

void loop() {
  unsigned int delayTime=millis()-curTime;
  
  
  float h = dht.readHumidity();
  float t = dht.readTemperature();

   Serial.print("H: ");
   Serial.println(h);
   Serial.print("T: ");
   Serial.println(t);
   Serial.println("\n");
   if(delayTime%1000==0){
    stepper.step(STEPS/60.f);
   }
}
