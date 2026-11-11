# // Input:
# // abcdefg

# // Output:
# // gbedcfa



class AlternateCharacterReverser:
    def AlternateCharacterReverserMethods(str):
        evenpositionString=""

        for i in range(len(str)):
            if(i%2==0):
                evenpositionString=evenpositionString+str[i]

        print(evenpositionString)

        reverseevenpositionString=""

        for i in range(len(evenpositionString)-1,-1,-1):
            reverseevenpositionString=reverseevenpositionString+evenpositionString[i]

        print(reverseevenpositionString)

        index=0
        result=""

        for i in range(len(str)):
            if(i%2==0):
                result=result+reverseevenpositionString[index]
                index=index+1

            else:
                result=result+str[i]

        print(result)
str="abcdefg"
AlternateCharacterReverser.AlternateCharacterReverserMethods(str)
