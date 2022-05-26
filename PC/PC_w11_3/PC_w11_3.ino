const int sound=A0;
const int PIR = 2;
const int LED=13;
const int ACTIVE_BUZZER=10;
int ledState=LOW;

void setup() {
  pinMode(LED,OUTPUT);
  pinMode(PIR, INPUT);
  pinMode(ACTIVE_BUZZER,OUTPUT);
  Serial.begin(115200);
}

void loop() {
  
  int soundLevel=analogRead(sound);
  int state=digitalRead(PIR);
  Serial.println(state);
  if(soundLevel>60){
    ledState= (ledState==LOW)? HIGH:LOW;
    delay(100);
  }
  digitalWrite(LED,ledState);
  if(state==HIGH){
    digitalWrite(ACTIVE_BUZZER, HIGH);
  }
  
}
