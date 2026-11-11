// Input: [1, 2, 3, 4]
// Output: 24

class FindProductofAllElements {
    static FindProductofAllElementsMethods(arr) {
        let product = 1;
        for (let i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }

        console.log(product);
    }
}

let arr = [1, 2, 3, 4];
FindProductofAllElements.FindProductofAllElementsMethods(arr);