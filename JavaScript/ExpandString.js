// Input:
// a3b2c12d4

// Output:
// aaabbccccccccccccdddd

class ExpandString {
    static ExpandStringMethods(str) {
        let result = "";
        for (let i = 0; i < str.length; i++) {
            let ch = str[i];
            let count = 0;

            while (i + 1 < str.length && str[i + 1] >= '0' && str[i + 1] <= '9') {
                count = count *10 + Number(str[i + 1]);
                i++;
            }

            for (let k = 0; k < count; k++) {
                result = result + ch;
            }
        }
        process.stdout.write(result);
    }
}

let str = "a3b2c12d4";
ExpandString.ExpandStringMethods(str);