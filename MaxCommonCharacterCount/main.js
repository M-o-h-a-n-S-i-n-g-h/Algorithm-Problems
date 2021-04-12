const obj = {};
const obj2 = {};
let count = 1;
let s = 'aabcc';
let s1 = 'adcaa';

for (let i = 0; i < s.length; i++) {
  if (!obj.hasOwnProperty(s[i])) {
    obj[s[i]] = 1;
  } else {
    obj[s[i]]++;
  }
}

for (let i = 0; i < s1.length; i++) {
  if (!obj2.hasOwnProperty(s1[i])) {
    obj2[s1[i]] = 1;
  } else {
    obj2[s1[i]]++;
  }
}
