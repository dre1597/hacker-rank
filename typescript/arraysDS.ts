// https://www.hackerrank.com/challenges/arrays-ds/problem

function reverseArray(a: number[]): number[] {
  const reverseArray: number[] = [];

  for (let index = a.length - 1; index >= 0; index--) {
    reverseArray.push(a[index]);
  }
  return reverseArray;
}
