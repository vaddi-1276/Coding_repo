# Input: Java SELENIUM Testing

# Output: Lowercase = 9


class CountLowercaseLetters:
    def CountLowercaseLettersMethods(str):

        countoflowercaseletters=0
        result=""
        for i in range(len(str)):
            ch=str[i]

            if((ch>='a' and ch<='z')):
                countoflowercaseletters
                countoflowercaseletters=countoflowercaseletters+1
                result=result+ch

        print("Lowercase count = ",countoflowercaseletters)
        print("Result ",result)


str="Java SELENIUM Testing"
CountLowercaseLetters.CountLowercaseLettersMethods(str)