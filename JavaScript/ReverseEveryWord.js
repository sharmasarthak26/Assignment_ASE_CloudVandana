const str="This is a sunny day";
let rev=str.split(' ').map(word=>word.split('').reverse().join('')).join(' ');

console.log(rev);