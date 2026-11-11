# Input: Java
# Selenium

# Output: No

class CheckTwoStringsHaveSameLength:
    def CheckTwoStringsHaveSameLengthMethods(str1,str2):

        if(len(str1)!=len(str2)):
            print("No")
            return

        print("Yes")



str1="silent"
str2="listen"
CheckTwoStringsHaveSameLength.CheckTwoStringsHaveSameLengthMethods(str1,str2)