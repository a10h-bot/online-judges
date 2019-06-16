//https://www.codewars.com/kata/586f6741c66d18c22800010a
let sequenceSum = (begin, end, step) => {
  if (begin > end) {
    return 0;
  }
  return begin + sequenceSum(begin + step, end, step);
};

console.log(sequenceSum(2, 10, 3));

let array = [4, 8, 9, 12];
array.filter(x => x % 2 === 0 ? x : undefined).map(x => 2 * x).forEach(x => console.log(x));
let acc = array.reduce((acc, ele) => {
  acc += ele;
  return acc;
}, 0);

console.log(acc);

let array1 = [24, 18, 9, 3];
let x = array1.sort((a, b) => a - b)[0];
console.log(x);
let a = [8, 9, 10, 18];
console.log([8, 9, 10, 18][0]);

const Boxes = ['Box1', 'Box2', 'Box3', 'Box2'];
const setOfNum = [3, 13, 9, 15, 10, 2, 17];
console.log(Boxes);
console.log(setOfNum.reduce((acc, elem) => {
  acc += elem;
  return acc;
}, 0));

console.log(setOfNum.slice(2));

const newNum = [...setOfNum, ...Boxes]
console.log(newNum);

var customer = {
  name: "Foo"
}
var card = {
  amount: 7,
  product: "Bar",
  unitprice: 42
}
var message = `Hello ${customer.name},
want to buy ${card.amount} ${card.product} for
a total of ${card.amount * card.unitprice} bucks?`

console.log(message);

let student = {
  Name: "David"
}
let marks = {
  C: 90,
  JS: 98,
  Java: 80
}
let printCard = `We hereby confirm our student name ${student.Name} has scored a total of ${marks.JS} in JS`
console.log(printCard);

var list = [1, 2, 3]
var [a, , b] = list
  [b, a] = [a, b]

console.log(list);