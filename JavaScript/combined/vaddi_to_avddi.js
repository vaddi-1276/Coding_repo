// vaddi
// avddi
class vaddi_to_avddi {
    static vaddi_to_avddimethods(str) {
        let firstchar = str[0];
        let secondchar = str[1];
        let result = "";

        for (let i = 0; i < str.length; i++) {
            if (i == 0) {
                result = result + secondchar;
            }
            else if (i == 1) {
                result = result + firstchar;
            }
            else
            {
                result=result+str[i];
            }
        }
        console.log(result);
    }
}

let str = "vaddi";
vaddi_to_avddi.vaddi_to_avddimethods(str);