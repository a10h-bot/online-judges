function reachable(n) {
  let s = new Set();
  while (s.size != 1) {
    s.add(n);
    n += 1;
    while (n % 10 === 0) {
      n /= 10;
    }
  }
  return s.size;
}

console.log(reachable(1098));
