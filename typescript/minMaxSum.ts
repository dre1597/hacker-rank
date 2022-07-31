// https://www.hackerrank.com/challenges/mini-max-sum/problem

function miniMaxSum(arr: number[]): void {
  const max = Math.max(...arr);
  const min = Math.min(...arr);

  const sum = arr.reduce((acc, curr) => acc + curr, 0);

  console.log(`${sum - max} ${sum - min}`);
}
