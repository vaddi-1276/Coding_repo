# Input:
# programming

# Output:
# aggimmnoprr

class CharacterSorter:
    def CharacterSorterMethods(str):

        String=list(str)
        result=""

        for i in range(len(String)):
            for j in range(i+1,len(String)):

                if(String[i]>String[j]):
                    temp=String[i]
                    String[i]=String[j]
                    String[j]=temp

        for i in range(len(String)):
            result=result+String[i]

        print(result)



str="programming"
CharacterSorter.CharacterSorterMethods(str)