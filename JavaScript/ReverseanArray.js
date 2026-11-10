// Input:
// [10, 20, 30, 40, 50]

// Output:
// [50, 40, 30, 20, 10]

class ReverseanArray {
    static ReverseanArrayMethods(arr) {
        for (let i = 0; i < arr.length; i++) {
            for (let j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    let temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        process.stdout.write("[")
        for (let i = 0; i < arr.length; i++) {
            process.stdout.write(arr[i] + " ");

            if (i < arr.length - 1) {
                process.stdout.write(",")
            }
        }
        process.stdout.write("]")
        process.stdout.write("\n");
    }
}

let arr = [10, 20, 30, 40, 50];
ReverseanArray.ReverseanArrayMethods(arr);