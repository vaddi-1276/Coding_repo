# Input: Selenium
# Character = S

# Output: Yes

class CheckStringStartsWithaCharacter:
    def CheckStringStartsWithaCharacterMethods(str):
        for i in range(len(str)):
            if(i==0):
                if(str[i]=='S'):
                    print("Yes")
                    return
        
        print("No")

str="Selenium"
CheckStringStartsWithaCharacter.CheckStringStartsWithaCharacterMethods(str)