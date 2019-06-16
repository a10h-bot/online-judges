// //IP Validation
// Write an algorithm that will identify valid IPv4 addresses in dot - decimal format.
//IPs should be considered valid if they consist of four octets with values between 0 and 255, inclusive.

//https://www.codewars.com/kata/ip-validation/train/javascript

function ipValidator(str) {
  let array;
  let res = false;
  if (str.split('.').length === 4) {
    array = str.split('.');
    console.log(array);

    for (let i = 0; i < array.length; i++) {
      const element = parseInt(array[i]);
      console.log(element);
      if (element >= 0 && element <= 255) {
        res = true;
      }
      console.log(element);

    }
  }
  return res;
}

// console.log(ipValidator('123.45.67.89'));
console.log(ipValidator('123.456.789.0'));

