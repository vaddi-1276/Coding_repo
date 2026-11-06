// Input:
// Array 1 = [1, 2, 3, 4, 5]
// Array 2 = [3, 4, 5, 6, 7]

// Output:
// 3, 4, 5

class FindCommonElements {
    static FindCommonElementsMethods(arr1, arr2) {
        let first = true;
        for (let i = 0; i < arr1.length; i++) {
            for (let j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    if (first === false) {
                        process.stdout.write(",")
                    }
                    process.stdout.write(String(arr1[i]));
                    first = false;
                }
            }
        }
        process.stdout.write("\n");
    }
}

let arr1 = [1, 2, 3, 4, 5];
let arr2 = [3, 4, 5, 6, 7];
FindCommonElements.FindCommonElementsMethods(arr1, arr2);