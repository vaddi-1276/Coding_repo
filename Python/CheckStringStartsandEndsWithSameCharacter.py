# Input: level
# Output: Yes

class CheckStringStartsandEndsWithSameCharacter:
    def CheckStringStartsandEndsWithSameCharacterMethods(str):
        for i in range(len(str)):
            if(i==0):
                if(str[i]==firstletter and str[len(str)-1]==lastletter):
                    print("Yes")
                    return
        print("No")
str="level"
firstletter="l"
lastletter="m"
CheckStringStartsandEndsWithSameCharacter.CheckStringStartsandEndsWithSameCharacterMethods(str)