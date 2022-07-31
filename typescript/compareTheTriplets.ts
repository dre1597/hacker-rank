// https://www.hackerrank.com/challenges/compare-the-triplets/problem

function compareTriplets(a: number[], b: number[]): number[] {
  let alicePoints = 0;
  let bobPoints = 0;

  for (const index in a) {
    if (a[index] > b[index]) {
      alicePoints++;
    } else if (a[index] < b[index]) {
      bobPoints++;
    }
  }

  return [alicePoints, bobPoints];
}
