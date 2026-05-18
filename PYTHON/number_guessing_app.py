import random

number = int(input("Guess the number :  "))
right_number = random.randrange(1 , 101)

if (number <= 100) and (number >= 1):
    j = 0
    for count in range(1 , 2):
        if (number != right_number):
            for counter in range(1 , 5):
                if (number > right_number):
                    print("Number is higher!!!")
                else:
                    print("Number is lower!!!")
                number = int(input("Guess the number :  "))
                if (number <= 100) and (number >= 1):
                    if (number == right_number):
                        break
                else:
                    print("Wrong input!! , enter a number within the range of 1 to 100!!")  
                    for count in range(1 , 1000):
                        number = int(input("Guess the number :  "))
                        print("Wrong input!! , enter a number within the range of 1 to 100!!")  
                        if (number <= 100) and (number >= 1):
                            if (number > right_number):
                                print("Number is higher!!!")
                            else:
                                print("Number is lower!!!")
                            break
        else:
            j = j + 1
            if (j == 1):
                print("Legendary!!")
            elif (j == 2):
                print("Excellent!!")
            elif (j == 3):
                print("Good")
            elif (j == 4):
                print("Good")
            elif (j == 5):
                print("close!")
            elif (j == 0):
                print("No win , Better Luck")
    print("Correct number is " , right_number)

else:
    print("Wrong input!! , enter a number within the range of 1 to 100!!")




