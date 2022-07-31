// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

function catAndMouse(x, y, z) {
  const firstCatPosition = x;
  const secondCatPosition = y;
  const mousePosition = z;

  const travelFirstCatToMouse = Math.abs(firstCatPosition - mousePosition);
  const travelSecondCatToMouse = Math.abs(secondCatPosition - mousePosition);

  if (travelFirstCatToMouse < travelSecondCatToMouse) {
    return 'Cat A';
  } else if (travelFirstCatToMouse > travelSecondCatToMouse) {
    return 'Cat B';
  } else {
    return 'Mouse C';
  }
}
