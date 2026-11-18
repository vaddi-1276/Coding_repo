// Input:
// [10, 20, 30, 20, 10, 40]

// Output:
// 30

class FindFirstNonRepeatedElement {
    static FindFirstNonRepeatedElementMethods() {
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
                console.log(arr[i]);
                break;
            }
        }
    }
}

let arr = [10, 20, 30, 20, 10, 40];
FindFirstNonRepeatedElement.FindFirstNonRepeatedElementMethods(arr);