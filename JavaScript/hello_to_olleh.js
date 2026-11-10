// hello

// olleh

class hello_to_olleh
{
    static hello_to_ollehMethods(str)
    {
        let result="";
        for(let i=str.length-1;i>=0;i--)
        {
            result=result+str[i];
        }

        console.log(result);
    }
}

let str="hello";
hello_to_olleh.hello_to_ollehMethods(str);