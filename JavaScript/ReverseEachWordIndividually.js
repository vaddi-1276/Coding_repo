// Input

// Java Selenium Testing

// Output

// avaJ muineleS gnitseT


class ReverseEachWordIndividually {
    static ReverseEachWordIndividuallyMethods(str) {
        let words = str.split(" ");
        let result = "";

        for (let i = 0; i < words.length; i++) {
            for (let j = words[i].length - 1; j >= 0; j--) {
                result = result + words[i][j];
            }
            result = result + " ";
        }
        process.stdout.write(result)
        process.stdout.write("\n");
    }
}

let str = "Java Selenium Testing";
ReverseEachWordIndividually.ReverseEachWordIndividuallyMethods(str)