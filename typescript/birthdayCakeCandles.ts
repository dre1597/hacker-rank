// https://www.hackerrank.com/challenges/birthday-cake-candles/problem

function birthdayCakeCandles(candles: number[]): number {
  const max = Math.max(...candles);

  const arrayWithMax = candles.filter((candle) => candle === max);

  return arrayWithMax.length;
}
