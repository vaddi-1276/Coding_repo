// Input:
// [10, 40, 20, 50, 30]
// K = 2

// Output:
// 40


class Find_Kth_LargestElement {
    static Find_Kth_LargestElementMethods(arr,value) {
        for (let i = 0; i < arr.length; i++) {
            for (let j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    let temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        let position=arr.length-value;
        console.log(arr[position]);
    }
}
let arr = [10, 40, 20, 50, 30];
let value=2;
Find_Kth_LargestElement.Find_Kth_LargestElementMethods(arr,value)
