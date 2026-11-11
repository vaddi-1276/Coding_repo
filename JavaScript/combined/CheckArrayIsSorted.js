// Input: [10, 20, 30, 40, 50]
// Output: Sorted


class CheckArrayIsSorted {
    static CheckArrayIsSortedMethods(arr) {
        for (let i = 0; i < arr.length; i++) {
            for (let j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    console.log("Not Sorted");
                    return;
                }
            }
        }
        console.log("Sorted");
    }
}

let arr = [10, 20, 30, 40, 50];
CheckArrayIsSorted.CheckArrayIsSortedMethods(arr);