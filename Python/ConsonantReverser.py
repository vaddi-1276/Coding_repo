# Input:
# Automation

# Output:
# Aunotamiot


class ConsonantReverser:
    def ConsonantReverserMethods(str):
        Consonantstring=""
        vowels="AEIOUaeiou"
        reverseConsonantstring=""
        result=""
        for i in range(len(str)):
            ch=str[i]

            if ch not in vowels:
                Consonantstring=Consonantstring+ch

        for i in range(len(Consonantstring)-1,-1,-1):
            reverseConsonantstring=reverseConsonantstring+Consonantstring[i]

        index=0

        for i in range(len(str)):

            ch=str[i]
            if ch not in vowels:
                result=result+reverseConsonantstring[index]
                index=index+1

            else:
                result=result+ch

        print(result)
str="Automation"
ConsonantReverser.ConsonantReverserMethods(str)