var letterCombinations = (digits) => {
  if (digits === "") {
    return [];
  }
  const numberAndLetters = {
    1: [],
    2: ["a", "b", "c"],
    3: ["d", "e", "f"],
    4: ["g", "h", "i"],
    5: ["j", "k", "l"],
    6: ["m", "n", "o"],
    7: ["p", "q", "r", "s"],
    8: ["t", "u", "v"],
    9: ["w", "y", "x", "z"],
  };

  let combinations = [];
  combinations = [...numberAndLetters[digits[0]]];

  for (let i = 1; i < digits.length; i++) {
    let updatedCombo = [];
    combinations.forEach((letter) => {
      numberAndLetters[digits[i]].forEach((companionLetter) => {
        updatedCombo.push(letter + companionLetter);
      });
    });
    combinations = updatedCombo;
  }

  return combinations;
};

const result = letterCombinations("234");
console.log(result);

// console.log(combinations);
//   for (let letter of digits) {
//     var key = String(letter);
//     combinations.push(numberAndLetters[key]);
//   }
//   if (combinations.length == 1) {
//     return numberAndLetters[key];
//   }
//   var hold = combinations[0].length;
//   for (let i = 0; i < hold; i++) {
//     for (let j = 1; j <= combinations.length - 1; j++) {
//       let len = combinations[j].length;
//       for (let k = 0; k < len; k++) {
//         array.push(combinations[0][i] + combinations[j][k]);
//       }
//     }
//   }
//   return array;

//   //   console.log(combinations[0][0] + combinations[1][0]);
// };
