// Input:
// [1, 2, 3, 4, 5, 6, 7]

// Output:
// Even = 3
// Odd = 4

class CountEvenandOddNumbers {
    static CountEvenandOddNumbersMethods() {
        let evencount = 0;
        let oddcount = 0;
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evencount = evencount + 1;
            }
            else {
                oddcount = oddcount + 1;
            }
        }

        console.log("Even Count = " + evencount);
        console.log("Odd Count = " + oddcount);
    }
}

let arr = [1, 2, 3, 4, 5, 6, 7,8];
CountEvenandOddNumbers.CountEvenandOddNumbersMethods(arr);