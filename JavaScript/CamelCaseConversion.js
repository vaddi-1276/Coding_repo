// Input:
// java selenium testing

// Output:
// JavaSeleniumTesting

class CamelCaseConversion {
    static CamelCaseConversionMethods(str) {
        let words = str.split(" ");
        let result = "";

        for (let i = 0; i < words.length; i++) {
            let word = words[i];
            result = result + word.substr(0, 1).toUpperCase() + word.substr(1).toLowerCase();
        }

        console.log(result);
    }
}

let str = "java selenium testing";
CamelCaseConversion.CamelCaseConversionMethods(str);