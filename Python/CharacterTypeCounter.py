# Input:
# Java123@#

# Output:
# Alphabets = 4
# Digits = 3
# Special Characters = 2


class CharacterTypeCounter:
    def CharacterTypeCounterMethods(str):
        countofalphabets=0
        countofdigits=0
        countofspecialcharacters=0

        for i in range(len(str)):
            ch=str[i]

            if(ch>='A' and ch<='Z' or ch>='a' and ch<='z'):
                countofalphabets=countofalphabets+1
            elif(ch>='0' and ch<='9'):
                countofdigits=countofdigits+1
            else:
                countofspecialcharacters=countofspecialcharacters+1
        print("Alphabets = ",countofalphabets)
        print("Digits = ",countofdigits)
        print("Special Characters = ",countofspecialcharacters)





str="Java123@#"
CharacterTypeCounter.CharacterTypeCounterMethods(str)