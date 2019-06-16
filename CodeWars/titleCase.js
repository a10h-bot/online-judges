//https://www.codewars.com/kata/title-case/train/javascript
function capitalize(word) {
  return word[0].toUpperCase() + word.slice(1).toLowerCase();
}

function titleCase(title, minorWords = '') {
  if (title.trim() === '') return "";
  let checkMinorWords =
    minorWords.
  toLowerCase().split(" ").reduce((words, word) => {
    words[word] = true;
    return words;
  }, {});
  return title
    .toLowerCase()
    .split(' ')
    .map((word, i) => {
      if (i == 0) return capitalize(word);
      if (checkMinorWords[word]) return word;
      return capitalize(word);
    }).join(' ');

}

console.log(titleCase(''), '')
console.log(titleCase('a clash of KINGS', 'a an the of'), 'A Clash of Kings')
console.log(titleCase('THE WIND IN THE WILLOWS', 'The In'), 'The Wind in the Willows')
console.log(titleCase('the quick brown fox'), 'The Quick Brown Fox')