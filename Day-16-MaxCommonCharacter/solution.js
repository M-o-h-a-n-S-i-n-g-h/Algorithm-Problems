const maxChar = (string) => {
  let charCount = {};
  let count = 0;
  let maxChar = "";

  for (let i = 0; i < string.length; i++) {
    charCount[string[i]] = ++charCount[string[i]] || 1;
  }

  console.log(charCount);

  for (let char in charCount) {
    if (charCount[char] > count) {
      count = charCount[char];
      maxChar = char;
    }
  }
  return maxChar;
};
const result = maxChar("MohanSinghhnnnnnnnnnnn");
console.log(result);
