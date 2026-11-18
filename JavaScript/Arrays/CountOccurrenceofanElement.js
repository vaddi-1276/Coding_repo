// Input:
// [10, 20, 10, 30, 10, 40]
// Element = 10

// Output:
// 3


class CountOccurrenceofanElement {
    static CountOccurrenceofanElementMethods(arr, element) {
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
                    count = count + 1;
                }
            }

            if (arr[i] === element) {
                console.log(count);
            }
        }
    }
}

let arr = [10, 20, 10, 30, 10, 40];
let element = 40;
CountOccurrenceofanElement.CountOccurrenceofanElementMethods(arr, element);