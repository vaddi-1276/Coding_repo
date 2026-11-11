// Input: ABC

// Output: A = 65
// B = 66
// C = 67

class FindASCIIValueEachCharacter
{
    static FindASCIIValueEachCharacterMethods(str)
    {
        for(let i=0;i<str.length;i++)
        {
            let ch=str[i];
            console.log(ch+" = "+str.charCodeAt(i));
        }
    }
}
let str="ABC";
FindASCIIValueEachCharacter.FindASCIIValueEachCharacterMethods(str)