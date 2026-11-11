# Input:
# programming

# Output:
# p = 1
# r = 2
# o = 1
# g = 2
# a = 1
# m = 2
# i = 1
# n = 1

class CharacterFrequencyAnalyzer:
    def CharacterFrequencyAnalyzerMethods(str):

        for i in range(len(str)):
            found=False
            for j in range(i):
                if(str[i]==str[j]):
                    found=True
                    break
            if(found):
                continue

            count=1
            for k in range(i+1,len(str)):
                if(str[k]==str[i]):
                    count=count+1
            print(str[i]," = ",count)


str="programming"
CharacterFrequencyAnalyzer.CharacterFrequencyAnalyzerMethods(str)