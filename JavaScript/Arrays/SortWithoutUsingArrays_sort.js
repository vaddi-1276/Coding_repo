// Input:
// [5, 2, 8, 1, 3]

// Output:
// [1, 2, 3, 5, 8]


class SortWithoutUsingArrays_sort {
    static SortWithoutUsingArrays_sortMethods() {
        for (let i = 0; i < arr.length; i++) {
            for (let j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    let temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        console.log(arr);
    }
}

let arr = [5, 2, 8, 1, 3];
SortWithoutUsingArrays_sort.SortWithoutUsingArrays_sortMethods(arr);