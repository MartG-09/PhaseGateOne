function adds(number , numberOne){
    return number + numberOne
    }


function isEven(number){
    even = false
    if (number % 2 == 0){
        even = true
    }
    return even
}


function square(number){
    return number**2
}


function celsius_to_fahrenheit(celsius){
    answer = (celsius * 9/5) + 32
    return answer
    }


function isPrime(number){
    for (let count = 2; count <= number/2; count++){
        if (number % count == 0){
            return false
        }
      }
    return true
}


function largestOfThree(number , numberOne , numberTwo){
    largest = number
    if(largest < numberOne){
        largest = numberOne
    }
    if(largest < numberTwo){
        largest = numberTwo   
    }
    return largest 
    }


function simpleInterest(principal , rate , time){
    interest = (principal * rate * time) / 100
    return interest
    }


function areaOfRectangle(length , width){
    area = length * width
    return area
    }


function reverseNumber(number){
    num = 0
    while (number > 0){
        each = number % 10
        num = (num * 10) + each
        number /= 10
    }
    return num
    }

console.log(adds(2 , 6))
console.log(isEven(5))
console.log(square(4))
console.log(celsius_to_fahrenheit(100))
console.log(isPrime(4))
console.log(largestOfThree(90 , 27 , 24))
console.log(simpleInterest(1500 , 50 , 5))
console.log(areaOfRectangle(4 , 6))
console.log(reverseNumber(12345))













