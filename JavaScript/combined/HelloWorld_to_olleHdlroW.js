// Hello World

// olleH dlroW

class HelloWorld_to_olleHdlroW
{
    static HelloWorld_to_olleHdlroWMethods(str)
    {
        let result="";
        let word="";

        for(let i=0;i<str.length;i++)
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

        console.log(result);
    }
}

let str="Hello World";
HelloWorld_to_olleHdlroW.HelloWorld_to_olleHdlroWMethods(str);