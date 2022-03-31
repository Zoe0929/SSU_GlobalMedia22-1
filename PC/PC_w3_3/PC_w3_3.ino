
const int LED =13;

void setup() {
  pinMode(LED,OUTPUT);
}

void loop() {
  for(int t=0;t<=10;t++){
    int cnt=0;
    while(1){
      digitalWrite(LED,HIGH);
      delay(t);
      digitalWrite(LED,LOW);
      delay(10-t);  
      cnt++;
      if(cnt==10) break;
      }  
  }
}
