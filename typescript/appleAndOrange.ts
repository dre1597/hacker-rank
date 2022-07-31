// https://www.hackerrank.com/challenges/apple-and-orange/problem

function countApplesAndOranges(s: number, t: number, a: number, b: number, apples: number[], oranges: number[]): void {
  let applesCount = 0;
  let orangesCount = 0;

  apples.forEach((apple) => {
    const applePosition = a + apple;
    if (applePosition >= s && applePosition <= t) {
      applesCount++;
    }
  });

  oranges.forEach((orange) => {
    const orangePosition = b + orange;
    if (orangePosition >= s && orangePosition <= t) {
      orangesCount++;
    }
  });

  console.log(applesCount);
  console.log(orangesCount);
}
