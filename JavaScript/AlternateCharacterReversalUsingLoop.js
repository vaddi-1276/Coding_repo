// Input:
// abcdefg

// Output:
// gbedcfa

class AlternateCharacterReversalUsingLoop {
    static AlternateCharacterReversalUsingLoopMethods(str) {
        let evenposition = "";
        for (let i = 0; i < str.length; i++) {
            if (i % 2 == 0) {
                evenposition = evenposition + str[i];
            }
        }
        let reverseevenpositioncharacters = "";
        for (let i = evenposition.length - 1; i >= 0; i--) {
            reverseevenpositioncharacters = reverseevenpositioncharacters + evenposition[i];
        }
        let index = 0;
        let finalvalue = "";
        for (let i = 0; i < str.length; i++) {
            if (i % 2 == 0) {

                finalvalue = finalvalue + reverseevenpositioncharacters[index++];
            }
            else {
                finalvalue = finalvalue + str[i];
            }
        }

        console.log(finalvalue)
    }
}

let str = "abcdefg";
AlternateCharacterReversalUsingLoop.AlternateCharacterReversalUsingLoopMethods(str);