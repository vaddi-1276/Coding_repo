// Input:
// [0, 5, 0, 10, 2, 0, 8]

// Output:
// 3

class CountZeros {
    static CountZerosMethods(arr) {
        let countofzeros = 0;
        for (let i = 0; i < arr.length; i++) {
            if(arr[i]===0)
            {
                countofzeros+=1;
            }
        }

        console.log("Count of Zero's = "+countofzeros)
    }
}
let arr = [0, 5, 0, 10, 2, 0, 8];
CountZeros.CountZerosMethods(arr);