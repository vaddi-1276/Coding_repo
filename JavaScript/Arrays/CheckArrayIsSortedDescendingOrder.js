// Input: [50, 40, 30, 20, 10]
// Output: Sorted in Descending Order

class CheckArrayIsSortedDescendingOrder {
    static CheckArrayIsSortedDescendingOrderMethods(arr) {
        for (let i = 0; i < arr.length; i++) {
            for (let j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    console.log("Not Sorted");
                    return;
                }
            }
        }
        console.log("Sorted");
    }
}

let arr = [50, 40, 30, 20, 10];
CheckArrayIsSortedDescendingOrder.CheckArrayIsSortedDescendingOrderMethods(arr);