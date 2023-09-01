// Reverse an String 


const str = "abc";
const reversedString = str.split("").reduce((acc, char) => char + acc, "");
console.log(reversedString);
