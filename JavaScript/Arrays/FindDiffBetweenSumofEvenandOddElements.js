// Input: [1, 2, 3, 4, 5, 6]
// Output: 3


class FindDiffBetweenSumofEvenandOddElements {
    static FindDiffBetweenSumofEvenandOddElementsMethods(arr) {
        let sumofevennumbers = 0;
        let sumofoddnumbers = 0;

        for (let i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumofevennumbers = sumofevennumbers + arr[i];
            }

            if (arr[i] % 2 != 0) {
                sumofoddnumbers = sumofoddnumbers + arr[i];
            }
        }
        let difference=sumofevennumbers-sumofoddnumbers
    }
}

let arr = [1, 2, 3, 4, 5, 6];
FindDiffBetweenSumofEvenandOddElements.FindDiffBetweenSumofEvenandOddElementsMethods(arr);