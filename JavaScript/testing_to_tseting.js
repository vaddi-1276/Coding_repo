
//  testing
//  tseting

class testing_to_tseting {
    static testing_to_tsetingMethods(str) {
        let result = "";

        for (let i = 0; i < str.length; i++) {
            if (i == 1) {
                result = result + str[i + 1] + str[i];
                i++;
            }
            else {
                result = result + str[i];
            }
        }
        console.log(result);
    }
}

let str = "testing";
testing_to_tseting.testing_to_tsetingMethods(str);