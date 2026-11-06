// Input: automation
// Output: e = 0


class FindhighestFrequentVowel_and_LeastFrequentVowel {
    static FindhighestFrequentVowel_and_LeastFrequentVowelMethods(str) {

        let maxmimumcount=Number.MIN_SAFE_INTEGER;
        let highestfrequencyvowel=' ';
        let minimumcount = Number.MAX_SAFE_INTEGER;
        let vowels = ['a', 'e', 'i', 'o', 'u'];
        let leastfrequencyvowel = ' ';

        for (let i = 0; i < vowels.length; i++) {
            let count = 0;

            for (let j = 0; j < str.length; j++) {
                if (vowels[i] === str[j]) {
                    count++;
                }
            }
            if (count > maxmimumcount) {
                maxmimumcount = count;
                highestfrequencyvowel = vowels[i];
            }
        }
        console.log("Highest Frequency Vowels = "+highestfrequencyvowel+" = "+maxmimumcount)
        for (let i = 0; i < vowels.length; i++) {
            let count = 0;

            for (let j = 0; j < str.length; j++) {
                if (vowels[i] === str[j]) {
                    count++;
                }
            }
            if (count < minimumcount) {
                minimumcount = count;
                leastfrequencyvowel = vowels[i];
            }
        }
        console.log("Minimum Frequency Vowels = "+leastfrequencyvowel+" = "+minimumcount)
    }
}

let str = "automation";
FindhighestFrequentVowel_and_LeastFrequentVowel.FindhighestFrequentVowel_and_LeastFrequentVowelMethods(str);