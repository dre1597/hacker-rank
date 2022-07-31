// https://www.hackerrank.com/challenges/plus-minus/problem

function plusMinus(arr) {
  // Write your code here
  const length = arr.length;
  let numPositives = 0;
  let numNegatives = 0;
  let numZeros = 0;

  arr.forEach((elem) => {
    if (elem === 0) {
      numZeros++;
    } else if (elem > 0) {
      numPositives++;
    } else {
      numNegatives++;
    }
  });
  const ratioPositives = numPositives / length;
  const ratioNegatives = numNegatives / length;
  const ratioZeros = numZeros / length;

  console.log(ratioPositives);
  console.log(ratioNegatives);
  console.log(ratioZeros);
}
