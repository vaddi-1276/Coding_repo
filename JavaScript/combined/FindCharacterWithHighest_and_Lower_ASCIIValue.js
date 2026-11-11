// Input: BAD
// Output: D = 68


class FindCharacterWithHighest_and_Lower_ASCIIValue {
    static FindCharacterWithHighest_and_Lower_ASCIIValueMethods(str) {
        let firstmaximumasciivalue = Number.MIN_SAFE_INTEGER;
        let maximumchar = ' ';
        let firstminimumasciivalue = Number.MAX_SAFE_INTEGER;
        let minimumchar = ' ';

        for (let i = 0; i < str.length; i++) {
            let ch = str[i];

            if (ch.charCodeAt(0) > firstmaximumasciivalue) {
                firstmaximumasciivalue = ch.charCodeAt(0);
                maximumchar = ch;
            }
        }

        for (let i = 0; i < str.length; i++) {
            let ch = str[i];

            if (ch.charCodeAt(0) < firstminimumasciivalue) {
                firstminimumasciivalue = ch.charCodeAt(0);
                minimumchar = ch;
            }
        }


        console.log("Maxmium ASCII Value of " + maximumchar + " = " + firstmaximumasciivalue);
        console.log("Minimum ASCII Value of " + minimumchar + " = " + firstminimumasciivalue);
    }
}
let str = "BAD";
FindCharacterWithHighest_and_Lower_ASCIIValue.FindCharacterWithHighest_and_Lower_ASCIIValueMethods(str);
