// https://www.hackerrank.com/challenges/simple-array-sum/problem

function simpleArraySum(ar: number[]): number {
  return ar.reduce((acc: number, curr: number) => acc + curr, 0);
}
