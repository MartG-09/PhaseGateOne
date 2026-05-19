const prompt = require("prompt-sync")()

price = Number(prompt("Enter price :  "))
let tax = price * 0.1
console.log(tax+price)
