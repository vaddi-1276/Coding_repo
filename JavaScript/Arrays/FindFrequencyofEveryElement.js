// Input:
// [10, 20, 10, 30, 20, 10]

// Output:
// 10 = 3
// 20 = 2
// 30 = 1

class FindFrequencyofEveryElement {
    static FindFrequencyofEveryElementMethods(arr) {
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
            console.log(arr[i] + " = " + count);
        }
    }
}

let arr = [10, 20, 10, 30, 20, 10];
FindFrequencyofEveryElement.FindFrequencyofEveryElementMethods(arr);