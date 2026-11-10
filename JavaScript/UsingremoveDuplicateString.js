class UsingremoveDuplicateString {
    static UsingremoveDuplicateStringMethods(str) {
        for (let i = 0; i < str.length; i++) {
            let found = false;
            for (let j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if(found)
            {
                continue;
            }

            console.log(str.charAt(i))
        }
    }
}

str="programming";
UsingremoveDuplicateString.UsingremoveDuplicateStringMethods(str)