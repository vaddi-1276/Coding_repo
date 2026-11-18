// Input: [10, 20, 30, 40, 50]
// Output: 40, 50

class FindElementsGreaterThanAverage {
    static FindElementsGreaterThanAverageMethods() {
        let sum = 0;
        for (let i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        let average = sum / arr.length;

        let first = true;
        process.stdout.write("Greater Than Average ");
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                if (first === false) {
                    process.stdout.write(",");
                }
                process.stdout.write(String(arr[i]));
                first = false;
            }
        }
        process.stdout.write("\n");

        first = true;
        process.stdout.write("Less Than Average ");
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                if (first === false) {
                    process.stdout.write(",");
                }
                process.stdout.write(String(arr[i]));
                first = false;
            }
        }
        process.stdout.write("\n");
    }
}

let arr = [10, 20, 30, 40, 50];
FindElementsGreaterThanAverage.FindElementsGreaterThanAverageMethods(arr);