// Input:
// programming

// Output:
// progamin

class DuplicateCharacterRemover {
    static DuplicateCharacterRemoverMethods(str) {
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

            process.stdout.write(str[i]);
        }
        process.stdout.write("\n");
    }
}

let str = "programming";
DuplicateCharacterRemover.DuplicateCharacterRemoverMethods(str);