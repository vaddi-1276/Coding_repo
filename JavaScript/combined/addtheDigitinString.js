//Java123
// 123
// Sum=6


class addtheDigitinString
{
    static addtheDigitinStringMethods(str)
    {
        let onlydigit="";
        let result=0;

        for(let i=0;i<str.length;i++)
        {
            if(Number(str[i]))
            {
                onlydigit=onlydigit+str[i];
            }
        }
        console.log("Only Digit from String "+onlydigit)

        for(let i=0;i<onlydigit.length;i++)
        {
            result=result+Number(onlydigit[i]);
        }
        console.log(result);
    }
}
let str="Java123";
addtheDigitinString.addtheDigitinStringMethods(str);