// https://www.hackerrank.com/challenges/plus-minus/problem

void plusMinus(int arr_count, int* arr) {
  int numPositives = 0;
  int numNegatives = 0;
  int numZeros = 0;
  float ratioPositives, ratioNegatives, ratioZeros;
  
  for(int index = 0; index < arr_count; index++) {
    if (arr[index] == 0) {
      numZeros++;
    } else if (arr[index] > 0) {
      numPositives++;
    } else {
      numNegatives++;
    }
  }
  
  ratioPositives = (float) numPositives / arr_count;
  ratioNegatives = (float) numNegatives / arr_count;
  ratioZeros = (float) numZeros / arr_count;
  
  printf("%f\n", ratioPositives);
  printf("%f\n", ratioNegatives);
  printf("%f\n", ratioZeros);
}