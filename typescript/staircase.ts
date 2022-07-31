// https://www.hackerrank.com/challenges/staircase/problem

function staircase(n: number): void {
  for (let index = 1; index <= n; index++) {
    console.log(' '.repeat(n - index) + '#'.repeat(index));
  }
}
