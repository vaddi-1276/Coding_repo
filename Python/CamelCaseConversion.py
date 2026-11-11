# Input:
# java selenium testing

# Output:
# JavaSeleniumTesting

class CamelCaseConversion:

    @staticmethod
    def CamelCaseConversionMethods(str):
        words=str.split()
        result=""

        for i in range(len(words)):
            word=words[i]

            result=result+word[0:1].upper()+word[1:].lower()
        print(result)

str="java selenium testing"
CamelCaseConversion.CamelCaseConversionMethods(str)