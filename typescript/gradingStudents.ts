// https://www.hackerrank.com/challenges/grading/problem

function gradingStudents(grades: number[]): number[] {
  const roundedGrades: number[] = [];

  for (let grade of grades) {
    if (grade < 38) {
      roundedGrades.push(grade);
      continue;
    }
    const nextMultipleRounded = Math.ceil(grade / 5) * 5;

    const conditionToRound = nextMultipleRounded - grade < 3;

    if (conditionToRound) {
      roundedGrades.push(nextMultipleRounded);
    } else {
      roundedGrades.push(grade);
    }
  }
  return roundedGrades;
}
