def negative(array):
    for count in range(len(array)):
        if (array[count] < 0):
            array[count] = 0
    return array


def zero_to_last_side(arrays):
     for count in range(len(arrays)):
        if (arrays[count] == 0):
            array.insert(-1 , arrays[count]) 
            del(arrays[count])
    return arrays


array = [5 , -9 , 3 , -6 , 2 , -11]
arrays = [5 , 0 , 3 , 0 , 2 , 0]
print(negative(array))
print(zero_to_last_side(arrays))
