// //ccum("abcd") -> "A-Bb-Ccc-Dddd"
// accum("RqaEzty") - > "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// accum("cwAt") - > "C-Ww-Aaa-Tttt"
function accum(str) {
  let temp = [...str]
  let len = str.length;
  let res = [];
  for (let i = 0; i < temp.length; i++) {
    let x = temp[i];
    let k = i + 1;
    let j = k;
    while (k >= 1) {
      if (j === k) {
        res.push(x.toUpperCase());
      } else {
        res.push(x);
      }
      k -= 1;
    }
    if (i < len - 1) {
      res.push('-');
    }
  }
  return res.join("");
}

console.log(accum('abcd'));
console.log(accum('RqaEzty'));
console.log(accum('cwAt'));

function accum1(str) {
  let res = '';
  for (let i = 0; i < str.length; i++) {
    for (let j = 0; j < i + 1; j++) {
      if (j === 0) {
        res += str[i].toUpperCase();
      } else {
        res += str[i].toLowerCase();
      }
    }
    if (i !== str.length - 1) {
      res += '-';
    }

  }
  return res
}


console.log(accum1('abcd'));
console.log(accum1('RqaEzty'));
console.log(accum1('cwAt'));