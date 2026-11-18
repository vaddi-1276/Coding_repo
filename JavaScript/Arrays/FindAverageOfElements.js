// Input:
// [10, 20, 30, 40, 50]

// Output:
// 30


class FindAverageOfElements {
    static FindAverageOfElementsMethods() {
        let sum = 0;
        for (let i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        let average = sum / arr.length;
        console.log(average);
    }
}

let arr = [10, 20, 30, 40, 50];
FindAverageOfElements.FindAverageOfElementsMethods(arr);