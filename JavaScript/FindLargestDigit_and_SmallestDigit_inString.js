// Input: Java583Testing24
// Output: 8


class FindLargestDigit_and_SmallestDigit_inString {
    static FindLargestDigit_and_SmallestDigit_inStringMethods(str) {

        let largestdigit = Number.MIN_SAFE_INTEGER;
        let smallestdigit = Number.MAX_SAFE_INTEGER;

        for (let i = 0; i < str.length; i++) {
            if (Number(str[i]) > largestdigit) {
                largestdigit = str[i];
            }
        }
        console.log("Largest Digit = " + largestdigit)

        for (let i = 0; i < str.length; i++) {
            if (Number(str[i]) < smallestdigit) {
                smallestdigit = str[i];
            }
        }
        console.log("Smallest Digit = " + smallestdigit)
    }
}
let str = "Java583Testing24";
FindLargestDigit_and_SmallestDigit_inString.FindLargestDigit_and_SmallestDigit_inStringMethods(str);