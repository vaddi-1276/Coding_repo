#  Input:
#  abcdefg

#  Output:
#  gbedcfa

class AlternateCharacterReverser:
    def AlternateCharacterReverserMethods(str):

        onlyevenpostions=""
        for i in range(len(str)):
            if(i%2==0):
                onlyevenpostions=onlyevenpostions+str[i]

        reverseonlyevenpostions=""

        for j in range(len(onlyevenpostions)-1,-1,-1):
            reverseonlyevenpostions=reverseonlyevenpostions+onlyevenpostions[j]

        index=0
        result=""

        for i in range(len(str)):
            if(i%2==0):
                result=result+reverseonlyevenpostions[index]
                index=index+1
            else:
                result=result+str[i]

        print(result)

str="abcdefg"
AlternateCharacterReverser.AlternateCharacterReverserMethods(str)