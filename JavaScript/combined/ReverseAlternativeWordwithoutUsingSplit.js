//  Java Selenium Python Learning

//  avaJ Selenium nohtyP Learning

class ReverseAlternativeWordwithoutUsingSplit {
    static ReverseAlternativeWordwithoutUsingSplitMethods(str) {
        let result = "";
        let word = "";
        let count = 0;

        for (let i = 0; i < str.length; i++) {
            if (str[i] != ' ') {
                word = str[i] + word;
            }
            else {
                if (count % 2 == 0) {
                    result = result + word;
                }

                else {
                    for (let j = word.length - 1; j >= 0; j--) {
                        result = result + word[j];
                    }
                }
                result = result + " ";
                word = "";
                count = count + 1;

            }
        }
        for (let j = word.length - 1; j >= 0; j--) {
            result = result + word[j];
        }

        // result = result + word;

        console.log(result);
    }
}

let str = "Java Selenium Python Learning";
ReverseAlternativeWordwithoutUsingSplit.ReverseAlternativeWordwithoutUsingSplitMethods(str);