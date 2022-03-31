const int LED=10;

void setup() {
  
}

void loop() {
  for(int t=0;t<=255;t++)
  {
    analogWrite(LED,t);
    delay(100);
    }
  
  
}
