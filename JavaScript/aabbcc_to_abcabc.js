//  aabbcc
// abcdabc

class aabbcc_to_abcabc {
    static aabbcc_to_abcabcMethods(str) {
        let result = "";
        let unique = "";

        // Find unique characters
        for (let i = 0; i < str.length; i++) {
            if (!unique.includes(str[i])) {
                unique += str[i];
            }
        }
        console.log(unique);
    }
}

let str = "aabbdcc";
aabbcc_to_abcabc.aabbcc_to_abcabcMethods(str);