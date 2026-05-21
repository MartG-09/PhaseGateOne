def descend(array):
    largest = 0

    for count in range(len(array)):
            if (array[count] > largest):
                largest = array[count]

    smallest = array[0]

    for number in range(len(array)):
            if (array[number] < smallest):
                smallest = array[number]

                    

    newArray = []
    for counter in range(smallest , largest + 1):                         
        newArray.append(counter)


    return newArray


