// Input:
// [10, 20, 30, 40, 50]
// Search = 40

// Output:
// Index = 3

class FindIndexofanElement {
    static FindIndexofanElementMethods(arr, search) {
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] === search) {
                console.log(i);
            }
        }
    }
}

let arr = [10, 20, 30, 40, 50];
let search = 40;
FindIndexofanElement.FindIndexofanElementMethods(arr, search);