// Input: [-10, -3, 5, 8, -2]

// Output: -2

class FindElementClosesttoZero
{
    static FindElementClosesttoZeroMethods(arr,target)
    {
        let value=0;
        for(let i=0;i<arr.length;i++)
        {
            if(arr[i]<target)
            {
                value=arr[i];
            }
        }
        console.log(value);
    }
}

let arr =[-10, -3, 5, 8, -2];
let target=0;
FindElementClosesttoZero.FindElementClosesttoZeroMethods(arr,target);