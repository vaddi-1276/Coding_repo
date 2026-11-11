# Input: Selenium
# Sele

# Output: Yes


class CheckPrefixofAnotherString:
    def CheckPrefixofAnotherStringMethods(str,prefixstring):

        if(str.startswith(prefixstring)):
            print("Yes")
        else:
            print("No")


str="Selenium"
prefixstring="Sele"
CheckPrefixofAnotherString.CheckPrefixofAnotherStringMethods(str,prefixstring)