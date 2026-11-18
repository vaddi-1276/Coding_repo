// Input:
// Array 1 = [1, 2, 3, 4]
// Array 2 = [1, 2, 4, 3]

// Output:
// Not Equal


class CheckTwoArraysAreEqual {
    static CheckTwoArraysAreEqualMethods(arr1, arr2) {
        if (arr1.length != arr2.length) {
            console.log("Not Equals because of Length");
            return;
        }

        for (let i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                console.log("Not Equal because values are not Equal");
                return;
            }
        }
        console.log("Equals");
    }
}

let arr1 = [1, 2, 3, 4];
let arr2 = [1, 2, 4, 4];
CheckTwoArraysAreEqual.CheckTwoArraysAreEqualMethods(arr1, arr2);