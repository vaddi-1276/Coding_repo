// Input:
// Java Selenium Automation Testing

// Output:
// Selenium

class SecondLargestWord {
    static SecondLargestWordMethods(str) {
        let words = str.split(" ");

        let firstlargestwordlength = 0;
        let secondlargestwordlength = 0;
        let firstlargestword = words[0];
        let secondlargestword = words[0];

        for (let i = 0; i < words.length; i++) {
            if (words[i].length > firstlargestwordlength) {
                secondlargestwordlength = firstlargestwordlength
                secondlargestword = firstlargestword;

                firstlargestwordlength = words[i].length;
                firstlargestword = words[i];
            }

            else if (words[i].length > secondlargestwordlength && firstlargestwordlength != words[i]) {
                secondlargestwordlength = words[i].length
                secondlargestword = words[i];
            }
        }
        console.log("First Largest Word  " + firstlargestword + " and First Largest Word Length is " + firstlargestwordlength)
        console.log("Second Largest Word  " + secondlargestword + " and Second Largest Word Length is " + secondlargestwordlength);
    }
}

let str = "Java Selenium Automation Testing";
SecondLargestWord.SecondLargestWordMethods(str);