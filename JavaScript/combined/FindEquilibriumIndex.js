
// Input: [-7, 1, 5, 2, -4, 3, 0]
// Output: 3



class FindEquilibriumIndex {
    static FindEquilibriumIndexMethods(arr) {
        for (let i = 0; i < arr.length; i++) {
            let leftsum = 0;
            let rightsum = 0;

            for (let j = 0; j < i; j++) {
                leftsum = leftsum + arr[j];
            }

            for (let j = i + 1; j < arr.length; j++) {
                rightsum = rightsum + arr[j];
            }

            if (leftsum == rightsum) {
                console.log(i);
                break;
            }
        }
    }
}

let arr = [-7, 1, 5, 2, -4, 3, 0];
FindEquilibriumIndex.FindEquilibriumIndexMethods(arr);
