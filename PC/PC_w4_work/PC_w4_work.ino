const int led[6] = {3, 5, 6, 9, 10, 11};
const int buttonPin1 = 2;
const int buttonPin2 = 4;

void setup() {
  for (int x = 0; x <= 5; x++) {
    pinMode(led[x], OUTPUT);
  }
  pinMode(buttonPin1, INPUT);
}

void loop() {
  int buttonInput1 = digitalRead(buttonPin1);
  int buttonInput2 = digitalRead(buttonPin2);

  if (buttonInput2 == HIGH && buttonInput1 == HIGH) {
    for (int i = 0; i <= 5; i++) {
      digitalWrite(led[i], HIGH); 
      buttonInput2 = digitalRead(buttonPin2);
      if (buttonInput2 == LOW) break;
      if (i == 5)
      {
        delay(500);
        for (int j = 0; j <= 5; j++) {
          digitalWrite(led[j], LOW);
        }

      }
      delay(100);
    }

  }
  else if (buttonInput1 == HIGH) {
    for (int x = 0; x <= 5; x++) {
      for (int x = 0; x <= 5; x++) {
        digitalWrite(led[x], LOW);
      }
      digitalWrite(led[x], HIGH);
      buttonInput1 = digitalRead(buttonPin1);
      if (buttonInput1 == LOW) break;

      delay(100);
    }
  }
}
