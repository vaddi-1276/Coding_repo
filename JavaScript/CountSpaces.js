
// Input: Java Selenium Automation
// Output: Spaces = 2

class CountSpaces {
    static CountSpacesMethods(str) {
        let count=0;

        for(let i=0;i<str.length;i++)
        {
            if(str[i]==' ')
            {
                count++;
            }
        }

        console.log(count);
    }
}

let str = "Java Selenium Automation";
CountSpaces.CountSpacesMethods(str)