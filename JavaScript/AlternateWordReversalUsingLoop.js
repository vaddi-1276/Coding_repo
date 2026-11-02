// Input:
// Java Selenium Testing Automation

// Output:
// avaJ Selenium gnitseT Automation

class AlternateWordReversalUsingLoop {
    static AlternateWordReversalUsingLoopMethods(str) {
        let words = str.split(" ");
        let result = "";
        for (let i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                for (let j = words[i].length - 1; j >= 0; j--) {
                    result = result + words[i][j];
                }
            }
            else {
                result = result + words[i];
            }
            result=result+" ";
        }
        console.log(result);
    }
}
let str = "Java Selenium Testing Automation";
AlternateWordReversalUsingLoop.AlternateWordReversalUsingLoopMethods(str)
