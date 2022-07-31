// https://www.hackerrank.com/challenges/time-conversion/problem

function timeConversion(s: string): string {
  const [hours, minutes, seconds] = s.split(':');

  const isPM = s.includes('PM');
  const isAM = s.includes('AM');
  const is12Hours = hours === '12';

  let hoursFormatted: string;
  let secondsFormatted: string;

  if (isPM) {
    secondsFormatted = seconds.replace('PM', '');

    if (is12Hours) {
      hoursFormatted = hours;
    } else {
      const hourFormattedTo24: number = parseInt(hours) + 12;
      hoursFormatted = hourFormattedTo24.toString();
    }
  } else if (isAM) {
    secondsFormatted = seconds.replace('AM', '');

    is12Hours ? (hoursFormatted = '00') : (hoursFormatted = hours);
  } else {
    hoursFormatted = hours;
    secondsFormatted = seconds;
  }

  return `${hoursFormatted}:${minutes}:${secondsFormatted}`;
}
