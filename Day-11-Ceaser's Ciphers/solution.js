// const encryptString = (character) => {
//   let code = "";
//   let newString = "";
//   for (let i = 0; i < character.length; i++) {
//     code = character[i].charCodeAt();
//     if (code == 90 || code === 122) {
//       console.log("1");
//       newString += String.fromCharCode((character[i].charCodeAt() - 26) >> 2);
//     } else if ((code >= 65 && code < 90) || (code >= 97 && code < 122)) {
//       console.log("2");
//       newString += String.fromCharCode(character[i].charCodeAt() + 2);
//     } else if (code == 45) {
//       console.log("3");
//       newString += String.fromCharCode(character[i].charCodeAt());
//     } else if (code > 90 || code > 122) {
//       console.log("4");
//       newString += String.fromCharCode(
//         parseInt(character[i].charCodeAt() + 2 - 26)
//       );
//     }
//   }
//   return newString;
// };

// const encryptedString = encryptString("Z"); //cdefghijklmnopqrstuvwxyzab
// console.log(encryptedString);
const encryptString = (string, rotation) => {
  let code;
  let newChar = "";
  var check;

  if (rotation > 26) {
    rotation = rotation % 26;
  }

  function isLowerCase(char) {
    if (char == char.toLowerCase()) {
      return true;
    }
  }

  for (let char of string) {
    code = char.charCodeAt();
    code += rotation;
    // console.log(code);
    if ((check = /[^a-zA-Z]/.test(char))) {
      //   console.log(check);
      newChar += char;
      //   console.log(newChar);
      continue;
    }
    if (code > 90 && code <= 122 && isLowerCase(char)) {
      //   console.log("1", code, char);
      newChar += String.fromCharCode(code);
      //   console.log(newChar);
    } else if (code > 97 && isLowerCase(char)) {
      //   console.log("2");
      newChar += String.fromCharCode(code - 26);
    } else if (code > 90 && !isLowerCase(char)) {
      //   console.log("3");
      newChar += String.fromCharCode(code - 26);
    } else if (code < 90 && !isLowerCase(char)) {
      newChar += String.fromCharCode(code);
    }
  }
  return newChar;
};

console.log(encryptString("middle-Outz", 28));
