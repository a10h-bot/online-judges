function modifyArray(nums) {
  return nums.map(e => {
    if (e % 2 === 0) return 2 * e;
    else return 3 * e;
  });
}
console.log(modifyArray([5, 2, 5, 8, 9]));

let d = "10/11/2009";
function getDayName(d) {
  let dayName;
  // Write your code here
  let weekDaysNos = {
    0: "Sunday",
    1: "Monday",
    2: "Tuesday",
    3: "Wednesday",
    4: "Thursday",
    5: "Friday",
    6: "Saturday"
  };
  dayName = new Date(d).getDay();
  return weekDaysNos[dayName];
}

console.log(getDayName(d));
