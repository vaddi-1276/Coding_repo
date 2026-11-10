
// I Love JavaScript
// I evoL tpircSavaJ

class Reverse_Each_word_atSamePositionWithOutUsingSplit {
    static Reverse_Each_word_atSamePositionWithOutUsingSplitMethods(str) {

        let result = "";
        let word = "";

        for (let i = 0; i < str.length; i++) {

            if (str[i] !== ' ') {
                word = str[i] + word;
            }

            else {
                result = result + word + " ";
                word = "";
            }
        }

        result = result + word;
        console.log(result);
    }
}

let str = "I Love JavaScript";
Reverse_Each_word_atSamePositionWithOutUsingSplit.Reverse_Each_word_atSamePositionWithOutUsingSplitMethods(str);