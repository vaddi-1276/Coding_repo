// Input:
// [10, 20, 30, 20, 40, 10]

// Output:
// 10

class FindLastRepeatedElement {
    static FindLastRepeatedElementMethods(arr) {
        for (let i = arr.length - 1; i >= 0; i--) {
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

            if(count>1)
            {
                console.log(arr[i]);
                break;
            }
        }
    }
}

let arr = [10, 20, 30, 20, 40, 10];
FindLastRepeatedElement.FindLastRepeatedElementMethods(arr);