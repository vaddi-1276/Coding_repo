// "I Love Java"	

// "Java Love I"

class ILoveJava_to_JavaLoveI
{
    static ILoveJava_to_JavaLoveIMethods(str)
    {
        let result="";
        let word="";

        for(let i=str.length-1;i>=0;i--)
        {
            if(str[i]!==' ')
            {
                word=str[i]+word;
            }
            else
            {
                result=result+word+" ";
                word="";
            }
        }
        result=result+word;
        console.log(result);
    }
}

let str="I Love Java";
ILoveJava_to_JavaLoveI.ILoveJava_to_JavaLoveIMethods(str);