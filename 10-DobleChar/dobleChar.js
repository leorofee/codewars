//Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

function doubleChar(str) {
    let newStr = ''
    for (let i = 0; i < str.length; i++){
      if (str[i] = str[i].toUpperCase()){
        for (let j = 0; j < str.length; j++){
          newStr += str[j] + str[j]
        }
      }
      break
    }
    return newStr;
  }
  
