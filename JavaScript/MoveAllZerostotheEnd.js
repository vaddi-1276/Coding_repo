// Input

// 8, 0, 3, 0, 5, 2, 0, 9

// Output

// 8, 3, 5, 2, 9, 0, 0, 0



class MoveAllZerostotheEnd {
    static MoveAllZerostotheEndMethods(arr) {
        for (let i = 0; i < arr.length; i++) {
            for (let j = i + 1; j < arr.length; j++) {

                if(arr[i]===0)
                {
                    let temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(let i=0;i<arr.length;i++)
        {
            process.stdout.write(arr[i]+" ");
        }
    }
}

let arr = [8, 0, 3, 0, 5, 2, 0, 9];
MoveAllZerostotheEnd.MoveAllZerostotheEndMethods(arr);