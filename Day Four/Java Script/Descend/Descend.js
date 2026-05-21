descend = (array) => {

                let largest = 0;
                for (let count = 0; count < array.length; count++) {
                                if (largest < array[count]) {
                                    largest = array[count];
                        }
                }

                let smallest = array[0];
                for (let count = 0; count < array.length; count++) {
                                if (smallest > array[count]) {
                                    smallest = array[count];
                        }
                }

                    
                                let size = (largest - smallest) + 1;
                                newArray = [];
                                 let sum = 0;
                                 for (let counter = smallest; counter <= largest; counter++) {                                 
                                       for (let num = sum; num < size; num ++) {
                                            newArray[num] = counter;
                                     }
                                            sum = sum + 1;
                                }


    return newArray
}
array= [12 , 3 , 2 , 9 , 3 , 14 , 10]
console.log(descend(array))
