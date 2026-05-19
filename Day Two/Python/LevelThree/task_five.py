number = int(input("Enter number :  "))

factorial = number
for count in range(1 , number):
    factorial = factorial * count
print(factorial)
