// https://www.hackerrank.com/challenges/diagonal-difference/problem

function diagonalDifference(arr: number[][]): number {
  let sumLeftDiag = 0;
  let sumRightDiag = 0;

  for (let index = 0; index < arr.length; index++) {
    sumLeftDiag += arr[index][index];
    sumRightDiag += arr[index][arr.length - index - 1];
  }

  return Math.abs(sumLeftDiag - sumRightDiag);
}
