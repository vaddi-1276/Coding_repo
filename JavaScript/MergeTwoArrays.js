// Input:
// Array 1 = [1, 4, 3]
// Array 2 = [4, 5, 6]

// Output:
// [1, 4, 3, 4, 5, 6]

class MergeTwoArrays
{
    static MergeTwoArraysMethods(arr1,arr2)
    {
        let temp=[];
        let index=0;

        for(let i=0;i<arr1.length;i++)
        {
            temp[index++]=arr1[i];
        }

        for(let i=0;i<arr2.length;i++)
        {
            temp[index++]=arr2[i];
        }

        console.log(temp);
    }
}

let arr1=[1, 4, 3];
let arr2=[4, 5, 6];
MergeTwoArrays.MergeTwoArraysMethods(arr1,arr2);