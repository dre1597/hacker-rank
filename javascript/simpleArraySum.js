// https://www.hackerrank.com/challenges/simple-array-sum/problem

function simpleArraySum(ar) {
  return ar.reduce((acc, curr) => acc + curr, 0);
}
