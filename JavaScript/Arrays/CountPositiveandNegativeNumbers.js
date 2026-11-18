// Input:
// [-5, 10, -3, 8, 0, -2]

// Output:
// Positive = 2
// Negative = 3

class CountPositiveandNegativeNumbers {
    static CountPositiveandNegativeNumbersMethods() {
        let positivecount = 0;
        let negativecount = 0;

        for (let i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positivecount = positivecount + 1;
            }
            else if (arr[i] < 0) {
                negativecount = negativecount + 1;
            }
        }
        console.log("Positive Count = " + positivecount);
        console.log("Negative Count = " + negativecount);
    }
}

let arr = [-5, 10, -3, 8, 0, -2];
CountPositiveandNegativeNumbers.CountPositiveandNegativeNumbersMethods(arr);