// Input:
// abcdef
// N = 2

// Output:
// cdefab

class RotateStringLeftbyN {
    static RotateStringLeftbyNMethods(str, value) {
        let result = "";
        for (let i = value; i < str.length; i++) {
            result = result + str[i];
        }
        for (let i = 0; i < value; i++) {
            result = result + str[i];
        }
        console.log(result)
    }
}

let str = "abcdef";
RotateStringLeftbyN.RotateStringLeftbyNMethods(str, 2);