checkTwoNumber = (array , number) => {
    let newArray = []

            let indexes = 0;
            for (let index = 0; index < array.length; index++) {
            
                twoNumber = false;
                for (let count = index + 1; count < array.length; count++) {
                       if (array[index] + array[count] == number) {
                            newArray[indexes] = array[count];
                            twoNumber = true;
                            break;
                        }
                }

                                  if (twoNumber) {
                                     newArray[indexes + 1] = array[index];
                                    break;
                                }
                     }
                         
    return newArray

    }

