//https://www.codewars.com/kata/does-my-number-look-big-in-this/
//6kyu
const narcissistic = value => {
  //
  let leng = (value + "").replace(".", "").length;
  if (leng === 1) return true;

  let s = 0;
  let res = value;

  for (let i = 0; i < leng; i++) {
    let x = res % 10;
    x = x ** leng;
    res = Math.floor(res / 10);
    s += x;
  }

  if (s === value) return true;
  else return false;
};
console.log(narcissistic(153)); //true

let x = "hello";
console.log(x.split(""));
