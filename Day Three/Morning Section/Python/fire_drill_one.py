def display_test(array):
    text = "no one likes this"
    if (len(array) == 0):
        text = text

    for count in range(len(array)):
        if (len(array) == 1):
            text = array[0] + " likes this"   
  
        elif (len(array) == 2):
            text = array[0] + " and " + array[1] +" likes this"  

        elif (len(array) == 3):
            text = array[0] + ", " + array[1] + " and " + array[2] +" likes this" 

        elif (len(array) > 3):
            other = str(len(array) - 2)
            text = array[0] + ", " + array[1] + " and " + other +" others likes this"

   
    return text


#array = ["Alex" , "John" , "Happy" , "Dad" , "Tayo"]
#print(displayTest(array))
