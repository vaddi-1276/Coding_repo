// Input:
// [40, 10, 30, 20, 50]

// Output:
// [50, 40, 30, 20, 10]

class SortArrayDescendingWithoutUsingSort {
    static SortArrayDescendingWithoutUsingSortMethods(arr) {
        for (let i = 0; i < arr.length; i++) {
            for (let j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    let temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        console.log(arr);
    }
}
let arr = [40, 10, 30, 20, 50];
SortArrayDescendingWithoutUsingSort.SortArrayDescendingWithoutUsingSortMethods(arr);