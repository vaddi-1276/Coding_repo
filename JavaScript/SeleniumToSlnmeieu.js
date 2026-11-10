// S e l e n i u m
// 0 1 2 3 4 5 6 7

// S l n m e i e u
// 0 2 4 7 1 5 3 6

class SeleniumToSlnmeieu {

    static methods(str) {
        let order=[0,2,4,7,1,5,3,6];
        let result="";
        for(let i=0;i<order.length;i++)
        {
            result=result+str[order[i]];
        }

        console.log(result);
    }
}

let str = "Selenium";
SeleniumToSlnmeieu.methods(str);
