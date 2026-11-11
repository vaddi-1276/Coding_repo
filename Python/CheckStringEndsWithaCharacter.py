# Input: Selenium
# Character = m

# Output: Yes

class CheckStringEndsWithaCharacter:
    def CheckStringEndsWithaCharacterMethods(str,letter):

        for i in range(len(str)):

            if(i==len(str)-1):

                if(str[i]==letter):
                    print("Yes")
                    return

        print("No")

str="Selenium"
letter="l"
CheckStringEndsWithaCharacter.CheckStringEndsWithaCharacterMethods(str,letter)