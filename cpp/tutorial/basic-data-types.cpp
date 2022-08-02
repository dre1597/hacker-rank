#include <iostream>
#include <cstdio>
using namespace std;

int main() {
  int integer;
  long longInteger;
  char character;
  float floatNumber;
  double doubleFloatNumber;
  
  scanf("%d %ld %c %f %lf", &integer, &longInteger, &character, &floatNumber, &doubleFloatNumber);
  
  printf("%d\n%ld\n%c\n%f\n%lf\n", integer, longInteger, character, floatNumber, doubleFloatNumber);
  
  return 0;
}