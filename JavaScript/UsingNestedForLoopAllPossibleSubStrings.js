// Input:
// ABC

// Output:

// A
// AB
// ABC
// B
// BC
// C

class UsingNestedForLoopAllPossibleSubStrings {
    static UsingNestedForLoopAllPossibleSubStringsMethods(str) {
        for (let i = 0; i < str.length; i++) {
            let temp = " ";
            for (let j = i; j < str.length; j++) {
                temp = temp + str[j];
                console.log(temp);
            }
        }
    }
}

let str = "ABC";
UsingNestedForLoopAllPossibleSubStrings.UsingNestedForLoopAllPossibleSubStringsMethods(str);