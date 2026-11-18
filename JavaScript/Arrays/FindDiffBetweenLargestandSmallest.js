// Input: [10, 25, 5, 40, 15]
// Output: 35

class FindDiffBetweenLargestandSmallest {
    static FindDiffBetweenLargestandSmallestMethods() {
        let largestnumber = Number.MIN_SAFE_INTEGER;
        let smallestnumber = Number.MAX_SAFE_INTEGER;

        for (let i = 0; i < arr.length; i++) {
            if (arr[i] > largestnumber) {
                largestnumber = arr[i];
            }

            if (arr[i] < smallestnumber) {
                smallestnumber = arr[i];
            }
        }
        let result=largestnumber-smallestnumber;
        console.log(result);
    }
}
let arr = [10, 25, 5, 40, 15];
FindDiffBetweenLargestandSmallest.FindDiffBetweenLargestandSmallestMethods(arr);