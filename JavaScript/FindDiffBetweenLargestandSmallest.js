// Input: [10, 25, 5, 40, 15]
// Output: 35


class FindDiffBetweenLargestandSmallest {
    static FindDiffBetweenLargestandSmallestMethods(arr) {
        let firstlargestnumber = Number.MIN_SAFE_INTEGER;
        let firstsmallestnumber = Number.MAX_SAFE_INTEGER;

        for (let i = 0; i < arr.length; i++) {
            if (arr[i] > firstlargestnumber) {
                firstlargestnumber = arr[i];
            }
        }
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] < firstsmallestnumber) {
                firstsmallestnumber = arr[i];
            }
        }
        let difference = firstlargestnumber - firstsmallestnumber;
        console.log("Output : " + difference)
    }
}

let arr = [10, 25, 5, 40, 15]
FindDiffBetweenLargestandSmallest.FindDiffBetweenLargestandSmallestMethods(arr);