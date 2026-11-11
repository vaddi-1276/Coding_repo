# // Input:
# // ABC

# // Output:

# // A
# // AB
# // ABC
# // B
# // BC
# // C


class AllPossibleSubStrings:

    def AllPossibleSubStringsMethods(str):
    
        for i in range(len(str)):
            temp=""

            for j in range(i,len(str)):
               temp=temp+str[j]
               print(temp)
    


str="ABC"
AllPossibleSubStrings.AllPossibleSubStringsMethods(str)