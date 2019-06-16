function removeSmallest(array) {
  if (array.length === 0) {
    return [];
  }
  let smallestIndex = 0;
  for (let i = 1; i < array.length; i++) {
    if (array[smallestIndex] > array[i]) {
      smallestIndex = i;
    }
  }
  let newArray = [];
  for (let i = 0; i < array.length; i++) {
    if (i !== smallestIndex) {
      newArray.push(array[i]);
    }
  }
  return newArray;
  let newArray = array.slice();
  // let newArray = [...array];
  // newArray.splice(smallestIndex, 1);
  // return newArray;

}

console.log(removeSmallest([1, 3, 6]));
console.log(removeSmallest([1, 2, 3, 4, 5]));
console.log(removeSmallest([5, 3, 2, 1, 4, 0]));
console.log(removeSmallest([2, 2, 1, 2, 1]));