// Input:
// [1, 2, 3, 5, 6]

// Output:
// 4

class FindSingleandMultipleMissingNumber {
    static FindSingleandMultipleMissingNumberMethods(arr) {
        let firstlargestnumber = 0;
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] > firstlargestnumber) {
                firstlargestnumber = arr[i];
            }
        }
        for (let i = 1; i <= firstlargestnumber; i++) {
            let found = false;
            for (let j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                process.stdout.write(i + " ");
            }
        }
        process.stdout.write("\n");
    }
}

let arr = [1, 2, 3, 5, 6, 9];
FindSingleandMultipleMissingNumber.FindSingleandMultipleMissingNumberMethods(arr);