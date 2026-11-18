// Input: [10, 20, 10, 30, 20, 10]
// Output: 10

class FindElementWithMaximum_and_Minimum_Frequency {
    static FindElementWithMaximum_and_Minimum_FrequencyMethods(arr) {
        let max = Number.MIN_SAFE_INTEGER;
        let maxarrvalue = arr[0];

        let min = Number.MAX_SAFE_INTEGER;
        let minarrvalue = arr[0];

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

            if (count > max) {
                max = count;
                maxarrvalue = arr[i];
            }

            if (count < min) {
                min = count;
                minarrvalue = arr[i];
            }
        }
        console.log("Maximum Frequency " + maxarrvalue);
        console.log("Minimum Frequency " + minarrvalue);
    }
}

let arr = [10, 20, 10, 30, 20, 10,40];
FindElementWithMaximum_and_Minimum_Frequency.FindElementWithMaximum_and_Minimum_FrequencyMethods(arr);