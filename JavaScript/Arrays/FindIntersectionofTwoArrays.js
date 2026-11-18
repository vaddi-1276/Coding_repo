// Input:
// Array 1 = [1, 2, 3, 4]
// Array 2 = [3, 4, 5, 6]

// Output:
// [3, 4]


class FindIntersectionofTwoArrays {
    static FindIntersectionofTwoArraysMethods(arr1, arr2) {

        process.stdout.write("[");
        let first = true;
        for (let i = 0; i < arr1.length; i++) {
            let found = false;
            for (let j = 0; j < arr2.length; j++) {
                if (arr1[i] === arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (found == true) {
                if (first === false) {
                    process.stdout.write(",");
                }
                process.stdout.write(String(arr1[i]));
                first = false;
            }
        }
        process.stdout.write("]");
        process.stdout.write("\n");
    }
}

let arr1 = [1, 2, 3, 4];
let arr2 = [3, 4, 5, 6];
FindIntersectionofTwoArrays.FindIntersectionofTwoArraysMethods(arr1, arr2);