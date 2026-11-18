// Input:
// [10, 40, 20, 50, 30]
// K = 2

// Output:
// 20

class FindKth_SmallestElement {
    static FindKth_SmallestElementMethods(arr, k) {
        for (let i = 0; i < arr.length; i++) {
            for (let j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    let temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        let position = k - 1;
        console.log(arr[position]);
    }
}

let arr = [10, 40, 20, 50, 30];
let k = 2;
FindKth_SmallestElement.FindKth_SmallestElementMethods(arr, k)