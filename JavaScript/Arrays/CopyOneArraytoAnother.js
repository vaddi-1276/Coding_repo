// Input:
// [10, 20, 30, 40]

// Output:
// [10, 20, 30, 40]

class CopyOneArraytoAnother {
    static CopyOneArraytoAnotherMethods() {
        let newarr = [];
        let index = 0;

        for (let i = 0; i < arr.length; i++) {
            newarr[index] = arr[i];
            index++;
        }

        console.log(newarr);
    }
}

let arr = [10, 20, 40, 30];
CopyOneArraytoAnother.CopyOneArraytoAnotherMethods(arr);