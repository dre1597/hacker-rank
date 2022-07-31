// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

function breakingRecords(scores: number[]): number[] {
  let min = 0;
  let max = 0;
  let maxScore = scores[0];
  let minScore = scores[0];

  scores.shift();

  scores.forEach((score) => {
    if (score > maxScore) {
      maxScore = score;
      max++;
    } else if (score < minScore) {
      minScore = score;
      min++;
    }
  });

  return [max, min];
}
