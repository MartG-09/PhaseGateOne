def adds(number , numberOne):
    return number + numberOne


def isEven(number):
    even = False
    if (number % 2 == 0):
        even = True
    return even


def square(number):
    return number**2


def celsius_to_fahrenheit(celsius):
    answer = (celsius * 9/5) + 32
    return answer


def isPrime(number):
    for count in range(2 , number//2):
        if (number % count == 0):
            return False
    return True


def largestOfThree(number , numberOne , numberTwo):
    largest = number
    if(largest < numberOne):
        largest = numberOne
    if(largest < numberTwo):
        largest = numberTwo   
    return largest 


def simpleInterest(principal , rate , time):
    interest = (principal * rate * time) / 100
    return interest


def areaOfRectangle(length , width):
    area = length * width
    return area


def reverseNumber(number):
    num = 0
    while (number > 0):
        each = number % 10
        num = (num * 10) + each
        number //= 10
    return num


#def 
print(adds(1 , 3))
print(isEven(6))
print(square(4))
print(celsius_to_fahrenheit(0))
print(isPrime(5))
print(largestOfThree(23 , 56 , 7))
print(simpleInterest(1500 , 50 , 5))
print(areaOfRectangle(3 , 5))
print(reverseNumber(12345))













