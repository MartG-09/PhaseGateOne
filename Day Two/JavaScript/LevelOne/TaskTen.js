const prompt = require("prompt-sync")()

numberOne = Number(prompt("Enter number :  "))
numberTwo = Number(prompt("Enter number :  "))
numberThree = Number(prompt("Enter number :  "))
let sum = numberOne + numberTwo + numberThree
let average = sum / 3
console.log(average)
