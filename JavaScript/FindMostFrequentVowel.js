// Input: automation
// Output: a = 2

class FindMostFrequentVowel {
    static FindMostFrequentVowelMethods(str) {
        let letter = 'a';

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

            if (str[i] == letter) {
                console.log(letter + " = " + count);
            }
        }
    }
}

let str = "automation";
FindMostFrequentVowel.FindMostFrequentVowelMethods(str);