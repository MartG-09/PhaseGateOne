number = int(input("Enter number:  "))
number_one = int(input("Enter number:  "))
number_two = int(input("Enter number:  "))


largest = number
if (largest < number_one):
    largest = number_one
if (largest < number_two):
    largest = number_two

print(largest)
