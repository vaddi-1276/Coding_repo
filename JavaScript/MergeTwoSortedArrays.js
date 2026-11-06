// Input:
// Array 1 = [1, 3, 5]
// Array 2 = [2, 4, 6]

// Output:
// [1, 2, 3, 4, 5, 6]

class MergeTwoSortedArrays {
    static MergeTwoSortedArraysMethods(arr1, arr2) {
        let temp = [];
        let index = 0;

        for (let i = 0; i < arr1.length; i++) {
            temp[index++] = arr1[i];
        }

        for (let i = 0; i < arr2.length; i++) {
            temp[index++] = arr2[i];
        }

        for(let i=0;i<temp.length;i++)
        {
            for(let j=i+1;j<temp.length;j++)
            {
                if(temp[i]>temp[j])
                {
                    let variable=temp[i];
                    temp[i]=temp[j];
                    temp[j]=variable;
                }
            }
        }
        console.log(temp);
    }
}

let arr1 = [1, 3, 5];
let arr2 = [2, 4, 6];
MergeTwoSortedArrays.MergeTwoSortedArraysMethods(arr1, arr2);