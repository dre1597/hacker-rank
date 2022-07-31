// https://www.hackerrank.com/challenges/kangaroo/problem

function kangaroo(x1: number, v1: number, x2: number, v2: number): string {
  if (v2 >= v1) {
    return 'NO';
  }

  const differenceX = x2 - x1;
  const differenceV = v2 - v1;

  if (differenceX % differenceV === 0) {
    return 'YES';
  }
  return 'NO';
}
