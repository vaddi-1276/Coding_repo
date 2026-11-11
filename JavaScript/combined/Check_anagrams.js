class Check_anagrams {
    static CheckanagramsMethods(str1, str2) {
        let arr1 = str1.split("");
        let arr2 = str2.split("");
        for (let i = 0; i < arr1.length; i++) {
            for (let j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    let temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for (let i = 0; i < arr2.length; i++) {
            for (let j = i + 1; j < arr2.length; j++) {
                if (arr2[i] > arr2[j]) {
                    let temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        if(arr1.length!=arr2.length)
        {
            console.log("false");
            return;
        }

        for(let i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                console.log("false");
                return;
            }
        }

        console.log("true");
    }
}

let str1 = "listen";
let str2 = "appear";
Check_anagrams.CheckanagramsMethods(str1, str2);