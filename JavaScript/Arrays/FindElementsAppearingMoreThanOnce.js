// Input: [5, 10, 5, 20, 10, 30, 10]

// Output: 5, 10

class FindElementsAppearingMoreThanOnce {
    static FindElementsAppearingMoreThanOnceMethods() {
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
                    count++;
                }
            }
            if (count > 1) {
                if (first === false) {
                    process.stdout.write(",");
                }
                process.stdout.write(String(arr[i]));
                first = false;
            }
        }
        process.stdout.write("\n");
    }
}

let arr = [5, 10, 5, 20, 10, 30, 10];
FindElementsAppearingMoreThanOnce.FindElementsAppearingMoreThanOnceMethods(arr);