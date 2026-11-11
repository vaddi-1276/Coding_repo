# Input: 123456
# Output: Yes


class CheckStringContainsOnlyDigits:
    def CheckStringContainsOnlyDigitsMethods(str):
        for i in range(len(str)):
            ch=str[i]

            if(not(ch>='0' and ch<='9')):
                print("No")
                return

        print("Yes")

str="123456@#$QQQ"
CheckStringContainsOnlyDigits.CheckStringContainsOnlyDigitsMethods(str)