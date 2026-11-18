// Input:
// [10, 25, 5, 40, 15]

// Output:
// Largest = 40
// Smallest = 5

class Find_Largest_and_Smallest_Element {
    static Find_Largest_and_Smallest_ElementMethods(arr) {
        let largest = Number.MIN_SAFE_INTEGER;
        let smallest = Number.MAX_SAFE_INTEGER;

        for (let i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        console.log("Largest = " + largest);
        console.log("Smallest = " + smallest);
    }
}

let arr = [10, 25, 5, 40, 15];
Find_Largest_and_Smallest_Element.Find_Largest_and_Smallest_ElementMethods(arr);