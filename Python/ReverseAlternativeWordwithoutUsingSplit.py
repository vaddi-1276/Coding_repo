# Java Selenium Python Learning

# avaJ Selenium nohtyP Learning

class ReverseAlternativeWordwithoutUsingSplit:
    def ReverseAlternativeWordwithoutUsingSplitMethods(input_string):

        result=""
        word=""
        count=0

        for i in range(len(input_string)):
            if(input_string[i]!=' '):
                word=input_string[i]+word

            else:
                if(count%2==0):
                    result=result+word
                else:
                    for j in range(len(input_string)-1,-1,-1):
                        result=result+word[j]
                        
            if(i<len(input_string)):
                result=result+" "

            word=""
            count=count+1

        print(result)


input_string="Java Selenium Python Learning"
ReverseAlternativeWordwithoutUsingSplit.ReverseAlternativeWordwithoutUsingSplitMethods(input_string)