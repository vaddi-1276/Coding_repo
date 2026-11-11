// int arr1[] = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3 };
// int arr2[] = { 2, 3, 4, 4, 4, 4, 5, 5 };

class Union {
    static UnionMethods(arr1, arr2) {
        let first = true;
        for (let i = 0; i < arr1.length; i++) {
            let found1 = false;
            for (let j = 0; j < i; j++) {
                if (arr1[i] === arr1[j]) {
                    found1 = true;
                    break;
                }
            }

            if (found1) {
                continue;
            }
            process.stdout.write(String(arr1[i]) + ",");
        }

        let second = true;

        for (let i = 0; i < arr2.length; i++) {
            let found2 = false;
            for (let j = 0; j < i; j++) {
                if (arr2[i] === arr2[j]) {
                    found2 = true;
                    break;
                }
            }

            if (found2) {
                continue;
            }

            for (let j = 0; j < arr1.length; j++) {
                if (arr2[i] === arr1[j]) {
                    found2 = true;
                    break;
                }
            }
            if (found2) {
                continue;
            }

            if (second === false) {
                process.stdout.write(",");
            }
            process.stdout.write(String(arr2[i]));
            second = false;
        }

        process.stdout.write("\n");
    }
}

let arr1 = [1, 1, 1, 2, 2, 2, 2, 3, 3, 3];
let arr2 = [2, 3, 4, 4, 4, 4, 5, 5];

Union.UnionMethods(arr1, arr2);