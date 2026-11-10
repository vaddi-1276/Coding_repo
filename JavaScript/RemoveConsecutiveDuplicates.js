// Input:
// aaabbccdaa

// Output:
// abcda



class RemoveConsecutiveDuplicates {
    static RemoveConsecutiveDuplicatesMethods(str) {
        for (let i = 0; i < str.length; i++) {

            if (i == str.length - 1 || str[i] != str[i + 1]) {
                process.stdout.write(str[i]);
            }
        }
        process.stdout.write("\n");
    }
}

let str = "aaabbccdaa";
RemoveConsecutiveDuplicates.RemoveConsecutiveDuplicatesMethods(str);
