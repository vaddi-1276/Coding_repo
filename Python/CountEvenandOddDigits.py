# Input: Java123456Testing

# Output:
# Even = 3
# Odd = 3

class CountEvenandOddDigits:
    def CountEvenandOddDigitsMethods(str):
        onlydigits=""

        for i in range(len(str)):
            ch=str[i]
            if(ch>='0' and ch<='9'):
                onlydigits=onlydigits+ch

        countofEvendigits=0
        countofOdddigits=0

        for i in range(len(onlydigits)):
            ch=onlydigits[i]
            if(int(ch)%2==0):
                countofEvendigits
                countofEvendigits=countofEvendigits+1

            else:
                countofOdddigits
                countofOdddigits=countofOdddigits+1

        print("Count of Even Digits =",countofEvendigits)
        print("Count of Odd Digits =",countofOdddigits)



str="Java123456Testing"
CountEvenandOddDigits.CountEvenandOddDigitsMethods(str)