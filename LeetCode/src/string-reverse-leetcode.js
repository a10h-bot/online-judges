function reverse(str) {
  if (str.trim() === "") return str;
  if (str.trim().length === 1) return str.trim();

  let out = [];
  str.split(" ").forEach(element => {
    if (element !== "") {
      out.unshift(element.trim());
    }

  });
  return out.join(' ');
}

console.log(reverse("   a   b "));
console.log(" 1".trim().length);