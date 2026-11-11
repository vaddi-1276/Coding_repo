// Input: Java
// Output: aavJ


class SwapFirstandLastCharacters {
    static SwapFirstandLastCharactersMethods(str) {
        let firstchar = str[0];
        let lastchar = str[str.length - 1];
        let result="";

        for (let i = 0; i < str.length; i++) {

            if(i==0)
            {
                result=result+lastchar;
            }

            else if(i==str.length-1)
            {
                result=result+firstchar;
            }
            else{
                result=result+str[i];
            }
        }
        console.log(result)
    }
}

let str = "Java";
SwapFirstandLastCharacters.SwapFirstandLastCharactersMethods(str);