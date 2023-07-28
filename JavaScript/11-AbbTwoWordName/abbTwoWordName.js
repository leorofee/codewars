function abbrevName(name){
  let fN = name[0]+ '.';
for (let i = 0; i < name.length; i++){
  if (name[i] == ' '){
    fN += name[i+1]
  }
}
  
  return fN.toUpperCase()
}