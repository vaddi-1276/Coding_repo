// a1b2c3d4

// 1234abcd

class a1b2c3d4_to_1234abcd {
    static result = "";
    static a1b2c3d4_to_1234abcdMethods(str) {
        for (let i = 0; i < str.length; i++) {
            if (str[i] >= '0' && str[i] <= '9') {
                this.result = this.result + str[i];
            }
        }
        for (let i = 0; i < str.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'Z' || str[i] >= 'a' && str[i] <= 'z') {
                this.result = this.result + str[i];
            }
        }
    }
}

let str = "a1b2c3d4";
a1b2c3d4_to_1234abcd.a1b2c3d4_to_1234abcdMethods(str)
process.stdout.write(a1b2c3d4_to_1234abcd.result + "\n")