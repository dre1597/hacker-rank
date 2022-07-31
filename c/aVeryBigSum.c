// https://www.hackerrank.com/challenges/a-very-big-sum/problem

long aVeryBigSum(int ar_count, long* ar) {
  long sum = 0;
  for(int index = 0; index < ar_count; index++) {
    sum += ar[index];
  }
  return sum;
}