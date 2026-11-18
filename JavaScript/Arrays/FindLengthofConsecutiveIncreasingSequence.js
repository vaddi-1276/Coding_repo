// Input: [1, 2, 3, 7, 8, 9, 10]
// Output: 4


class FindLengthofConsecutiveIncreasingSequence {
    static FindLengthofConsecutiveIncreasingSequenceMethods(arr) {
        let count = 1;
        let maxcount = 1;
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] + 1 === arr[i + 1]) {
                count++;
            }
            else {
                count = 1;
            }

            if (count > maxcount) {
                maxcount = count;
            }
        }
        console.log(maxcount);
    }
}

let arr = [1, 2, 3, 7, 8, 9, 10];
FindLengthofConsecutiveIncreasingSequence.FindLengthofConsecutiveIncreasingSequenceMethods(arr);