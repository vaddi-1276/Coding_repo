// Input: [15, 22, 8, 31, 44, 19]
// Output: 44


class FindLargestEven_and_OddNumber {
    static FindLargestEven_and_OddNumberMethods(arr) {
        let largestevennumber = Number.MIN_SAFE_INTEGER;
        let largestoddnumber = Number.MIN_SAFE_INTEGER;

        for (let i = 0; i < arr.length; i++) {
            if (arr[i] % 2 === 0) {
                if (arr[i] > largestevennumber) {
                    largestevennumber = arr[i];
                }
            }

            if (arr[i] % 2!== 0) {
                if (arr[i] > largestoddnumber) {
                    largestoddnumber = arr[i];
                }
            }
        }
        console.log("Largest Even Number = "+largestevennumber);
        console.log("Largest Odd Number = "+largestoddnumber);
    }
}

let arr = [15, 22, 8, 31, 44, 19];
FindLargestEven_and_OddNumber.FindLargestEven_and_OddNumberMethods(arr);