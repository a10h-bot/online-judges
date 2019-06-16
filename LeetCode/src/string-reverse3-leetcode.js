function reverseString(str) {
  if (str.trim() === "") return str;
  if (str.trim().length === 1) return str.trim();
  let res = [];
  str.split(' ').forEach(element => {
    let x = '';
    for (let i = element.length - 1; i >= 0; i--) {
      x += element.charAt(i);
    }
    res.push(x);

  });
  return res.join(" ")
}

console.log(reverseString("Let 's take LeetCode hello"));
//"s'teL ekat edoCteeL tsetnoc"