// Input:

// [10, 20, 10, 30, 20, 10]

// Output:
// 20


class FindElementWithSecondMaximum_and_Minimum_Frequency {
    static FindElementWithSecondMaximum_and_Minimum_FrequencyMethods() {
        let firstmax = Number.MIN_SAFE_INTEGER;
        let firstmaxarrvalue = arr[0];

        let firstmin = Number.MAX_SAFE_INTEGER;
        let firstminarrvalue = arr[0];

        let secondmax = Number.MIN_SAFE_INTEGER;
        let secondmaxarrvalue = arr[0];

        let secondmin = Number.MAX_SAFE_INTEGER;
        let secondminarrvalue = arr[0];

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

            if (count > firstmax) {
                secondmax = firstmax;
                secondmaxarrvalue = firstmaxarrvalue;

                firstmax = count;
                firstmaxarrvalue = arr[i];
            }
            else if (count > secondmax) {
                secondmax = count;
                secondmaxarrvalue = arr[i];
            }

            if (count < firstmin) {
                secondmin = firstmin;
                secondminarrvalue = firstminarrvalue;

                firstmin = count;
                firstminarrvalue = arr[i];
            }
            else if (count < secondmin) {
                secondmin = count;
                secondminarrvalue = arr[i];
            }
        }

        console.log("Second Maximum array value = " + secondmaxarrvalue);
        console.log("Second Maximum array value count = " + secondmax);

        console.log("Second Minimum  array value =  " + secondminarrvalue);
        console.log("Second Minimum  array value count = " + secondmin);
    }
}

let arr = [10, 20, 10, 30, 30, 20, 20, 40, 10];
FindElementWithSecondMaximum_and_Minimum_Frequency.FindElementWithSecondMaximum_and_Minimum_FrequencyMethods(arr);