
//https://www.codewars.com/kata/the-highest-profit-wins/

function minMax(array) {
  if (array.length === 1) return [array[0], array[0]];
  if (array[0] <= array[1]) {
    min = array[0];
    max = array[1];
  }
  else {
    min = array[1];
    max = array[0];
  }
  for (let i = 2; i < array.length; i++) {
    if (array[i] < min) {
      min = array[i];
    }
    if (array[i] > max) {
      max = array[i];
    }
  }
  return [min, max];
}
console.log(minMax([20, 3, 8, 9, 10, 7, 12, 1, 19]));
console.log(minMax([10, 8, 9, 4, 4, 10, 7, 18, 4]));
//_________________________________________________________________________
const minMax1 = a => [Math.min(...a), Math.max(...a)];

console.log(minMax1([20, 3, 8, 9, 10, 7, 12, 1, 19]));
