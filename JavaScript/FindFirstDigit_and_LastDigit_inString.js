// Input: Java123Testing
// Output: 1

class FindFirstDigit_and_LastDigit_inString
{
    static FindFirstDigit_and_LastDigit_inStringMethods(str)
    {
        for(let i=0;i<str.length;i++)
        {
            let ch=str[i];

            if(ch>='0' && ch<='9')
            {
                console.log("First Digit = "+ch);
                break;
            }
        }

        for(let i=str.length-1;i>=0;i--)
        {
            let ch=str[i];

            if(ch>='0' && ch<='9')
            {
                console.log("Last Digit = "+ch);
                break;
            }
        }
    }
}

let str="Java123Testing";
FindFirstDigit_and_LastDigit_inString.FindFirstDigit_and_LastDigit_inStringMethods(str);