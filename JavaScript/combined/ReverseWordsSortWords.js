// Input:
// Java Selenium Testing

// Output:
// gnitseT muineleS avaJ


class ReverseWordsSortWords {
    static ReverseWordsSortWordsMethods(str) {
        let result = "";
        for (let i = str.length - 1; i >= 0; i--) {
            if (str[i] ==" ") {
                result = result + " ";
            }
            else
            {
                result=result+str[i];
            }
        }
        process.stdout.write(result);
        process.stdout.write("\n");
    }
}

let str = "Java Selenium Testing";
ReverseWordsSortWords.ReverseWordsSortWordsMethods(str);