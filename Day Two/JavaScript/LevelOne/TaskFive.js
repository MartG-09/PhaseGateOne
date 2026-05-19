const prompt = require("prompt-sync")()

celsius = Number(prompt("Enter celsius :  "))
let fahrenheit = (celsius * 9/5) + 32
console.log(fahrenheit)
