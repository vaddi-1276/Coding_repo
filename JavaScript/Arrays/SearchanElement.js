// Input:
// [10, 20, 30, 40, 50]
// Search = 30

// Output:
// Element Found

class SearchanElement {
    static SearchanElementMethods(arr, searchvalue) {
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] === searchvalue) {
                console.log("Element Found");
                return;
            }
        }

        console.log("Element is Not Found");
    }
}
let arr = [10, 20, 30, 40, 50];
let searchvalue = 30;
SearchanElement.SearchanElementMethods(arr, searchvalue);