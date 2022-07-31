// https://www.hackerrank.com/challenges/a-very-big-sum/problem

function aVeryBigSum(ar: number[]): number {
  return ar.reduce((acc, curr) => acc + curr, 0);
}
