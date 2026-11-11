// Input:
// [1, 2, 3, 4, 5]
// N = 2

// Output:
// [3, 4, 5, 1, 2]


class LeftRotateArraybyNPositions
{
    static LeftRotateArraybyNPositionsMethods(arr)
    {
        let index=0;
        let position=value;
        let temp=[]

        for(let i=position;i<arr.length;i++)
        {
            temp[index++]=arr[i];
        }

        for(let i=0;i<position;i++)
        {
            temp[index++]=arr[i];
        }

        console.log(temp);
    }
}

let arr=[1, 2, 3, 4, 5];
let value=2;
LeftRotateArraybyNPositions.LeftRotateArraybyNPositionsMethods(arr,value);