//iamvaddi

//aivmdaid


class String_iamvaddi_to_aivmdaid {
    static String_iamvaddi_to_aivmdaidMethods(str) {
        let order = [1, 0, 3, 2, 5, 4, 7, 6];
        for (let i = 0; i < order.length; i++) {
            process.stdout.write(str[order[i]]);
        }

        process.stdout.write("\n");
    }
}

let str = "iamvaddi";
String_iamvaddi_to_aivmdaid.String_iamvaddi_to_aivmdaidMethods(str);