// Input:
// aaabbcdddd

// Output:
// a3b2c1d4

class CompressString {
    static CompressStringMethods(str) {
        for (let i = 0; i < str.length; i++) {
            let found = false;
            for (let j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            let count = 1;
            for (let k = i + 1; k < str.length; k++) {
                if (str[k] == str[i]) {
                    count++;
                }
            }

            process.stdout.write(str[i] + count)
        }
        process.stdout.write("\n");
    }
}

let str = "aaabbcdddd";
CompressString.CompressStringMethods(str)