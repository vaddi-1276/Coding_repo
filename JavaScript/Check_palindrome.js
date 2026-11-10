//madam

//Palindrome


class Check_palindrome
{
    static Check_palindromeMethods()
    {
        let reverse="";
        for(let i=str.length-1;i>=0;i--)
        {
            reverse=reverse+str[i];
        }

        if(str===reverse)
        {
            console.log("Palindrome");
        }
        else
        {
            console.log("Not Palindrome");
        }
    }
}

let str="like";
Check_palindrome.Check_palindromeMethods(str);
