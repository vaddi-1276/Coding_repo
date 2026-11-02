
// Input: [10, 20, 10, 30, 20, 40, 50]
// Output: 30, 40, 50


class FindAllElementsAppearingExactlyOnce {
    static FindAllElementsAppearingExactlyOnceMethods(arr) {

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
            if (count === 1) {
                if (first === false) {
                    process.stdout.write(" , ");
                }
                process.stdout.write(String(arr[i]));
                first = false;
            }
        }
        process.stdout.write("\n");
    }
}

let arr = [10, 20, 10, 30, 20, 40, 50];
FindAllElementsAppearingExactlyOnce.FindAllElementsAppearingExactlyOnceMethods(arr);