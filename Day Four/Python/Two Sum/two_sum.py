def check_two_number(array , number):
    new_array = []

    for count in range(len(array)):
        two_number = False

        for index in range(count + 1 , len(array)):
            if  (array[count] + array[index] == number):
                new_array.append(array[index])
                two_number = True
                break

        if (two_number):
            new_array.append(array[count])
            break

    return new_array

