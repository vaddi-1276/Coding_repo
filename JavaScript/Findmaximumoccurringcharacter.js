// aabbbcccc → c

class Findmaximumoccurringcharacter {
    static FindmaximumoccurringcharacterMethods(str) {
        let firstmaxcount = Number.MIN_SAFE_INTEGER;
        let firstmaxchar = ' ';
        let secondmaxcount = Number.MIN_SAFE_INTEGER;
        let secondmaxchar = ' ';
        for (let i = 0; i < str.length; i++) {
            let count = 0;
            for (let j = i + 1; j < str.length; j++) {
                if (str[i] === str[j]) {
                    count++;
                }
            }

            if (count > firstmaxcount) {
                secondmaxchar = firstmaxchar;
                secondmaxchar=firstmaxchar;

                firstmaxchar = str[i];
            }

            else if (count > secondmaxcount && firstmaxchar != str[i]) {
                secondmaxcount=count;
                secondmaxchar = str[i];
            }
        }
        console.log(firstmaxchar);
        console.log(secondmaxchar);

    }
}

let str = "aabbbcccc";
Findmaximumoccurringcharacter.FindmaximumoccurringcharacterMethods(str);