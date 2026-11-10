// Input:
// Array 1 = [1, 2, 3, 4]
// Array 2 = [1, 2, 4, 3]

// Output:
// Not Equal

class CheckTwoArraysAreEqual {
    static CheckTwoArraysAreEqual(arr1, arr2) {
        if (arr1.length != arr2.length) {
            console.log("Not Equal");
            return;
        }

        for (let i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                console.log("Not Equal");
                return;
            }
        }

        console.log("Equals");
    }
}

let arr1 = [1, 2, 3, 4];
let arr2 = [1, 2, 4, 4];
CheckTwoArraysAreEqual.CheckTwoArraysAreEqual(arr1, arr2);
