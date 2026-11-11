class UsingremoveDuplicateArrays {

    static UsingremoveDuplicateMethods(arr) {

        for (let i = 0; i < arr.length; i++) {
            let found = false;

            for (let j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            process.stdout.write(arr[i]+" ");
        }

    }

};
let arr = [10, 10, 20, 30, 20, 40, 40, 60, 50];
UsingremoveDuplicateArrays.UsingremoveDuplicateMethods(arr);
