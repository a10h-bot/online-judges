//https://www.codewars.com/kata/577bd026df78c19bca0002c0
//8kyu
const correctMistake = string => {
  const y = { 0: "O", 5: "S", 1: "I" };
  return string.replace(/0|5|1/g, letter => y[letter]);
};
