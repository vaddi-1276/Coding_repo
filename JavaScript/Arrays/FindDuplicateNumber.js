// Input:
// [1, 3, 4, 2, 2]

// Output:
// 2


class FindDuplicateNumber {
    static FindDuplicateNumberMethods() {
        let first = true;
        for (let i = 0; i < arr.length; i++) {
            let found = false;
            for (let j = 0; j < i; j++) {
                if (arr[i] === arr[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }

            let count = 1;
            for (let k = i + 1; k < arr.length; k++) {
                if (arr[k] === arr[i]) {
                    count += 1;
                }
            }

            if (count > 1) {

                if (first === false) {
                    process.stdout.write(",")
                }
                process.stdout.write(String(arr[i]));
                first = false;
            }
        }
        process.stdout.write("\n");
    }
}

let arr = [1, 3, 4, 2, 2];
FindDuplicateNumber.FindDuplicateNumberMethods(arr);