# Input:
# Java Selenium Testing Automation

# Output:
# avaJ Selenium gnitseT Automation

class AlternateWordReverser:

    @staticmethod
    def AlternateWordReverserMethods(str):
        words=str.split()
        result=""

        for i in range(len(words)):
            if(i%2==0):
                for j in range(len(words[i])-1,-1,-1):
                    result=result+words[i][j]

            else:
                result=result+words[i]

            if(i!=len(str)):
                result=result+" "

        
        print(result)


class AlternateWordReverserWithoutUsingSplit:

    def AlternateWordReverserWithoutUsingSplitMethods(str):

        result=""
        word=""
        count=0

        for i in range(len(str)):
            if(str[i]!=' '):
                word=str[i]+word

            else:
                if(count%2==0):
                    result=result+word

                else:
                    result=result+word[::-1]

                result=result+" "
                word=""
                count=count+1
            
        if(count%2==0):
                result=result+word
        else:
                result=result+word[::-1]
            
        print(result)


str = "Java Selenium Testing Automation"

#AlternateWordReverser.AlternateWordReverserMethods(str)

AlternateWordReverserWithoutUsingSplit.AlternateWordReverserWithoutUsingSplitMethods(str)