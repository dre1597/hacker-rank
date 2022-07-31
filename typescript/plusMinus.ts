// https://www.hackerrank.com/challenges/plus-minus/problem

function plusMinus(arr: number[]): void {
  const length: number = arr.length;
  let numPositives: number = 0;
  let numNegatives: number = 0;
  let numZeros: number = 0;

  arr.forEach((elem) => {
    if (elem === 0) {
      numZeros++;
    } else if (elem > 0) {
      numPositives++;
    } else {
      numNegatives++;
    }
  });
  const ratioPositives: number = numPositives / length;
  const ratioNegatives: number = numNegatives / length;
  const ratioZeros: number = numZeros / length;

  console.log(ratioPositives);
  console.log(ratioNegatives);
  console.log(ratioZeros);
}
