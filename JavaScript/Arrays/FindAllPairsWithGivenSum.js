// Input: [1, 5, 7, -1, 5]
// Target = 6

// Expected Output:
// 1 + 5 = 6
// 7 + (-1) = 6
// 1 + 5 = 6

class FindAllPairsWithGivenSum {
    static FindAllPairsWithGivenSumMethods(arr, target) {
        for (let i = 0; i < arr.length; i++) {
            for (let j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] === target) {
                    console.log(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
}

let arr = [1, 5, 7, -1, 5];
let target = 6;
FindAllPairsWithGivenSum.FindAllPairsWithGivenSumMethods(arr,target);