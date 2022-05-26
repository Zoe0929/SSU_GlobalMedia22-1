const int LED =13;
const int IR= A0;

void setup() {
  pinMode(LED, OUTPUT);
  pinMode(IR, INPUT);
  Serial.begin(115200);
}

void loop() {
  int value= analogRead(IR);

  Serial.println(value);

  if(value>500){
    digitalWrite(LED, HIGH);
  }
  else{
    digitalWrite(LED, LOW);
  }

  delay(100);
}
