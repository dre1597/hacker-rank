// https://www.hackerrank.com/challenges/bon-appetit/problem

function bonAppetit(bill: number[], k: number, b: number): void {
  const totalBillItems = bill.reduce((acc, curr) => acc + curr, 0);
  const anaItemValue = bill[k];
  const annaBill = totalBillItems - anaItemValue;

  const annaTotalValue = annaBill / 2;

  if (annaTotalValue === b) {
    console.log('Bon Appetit');
  } else {
    console.log(b - annaTotalValue);
  }
}
