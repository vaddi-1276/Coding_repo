# Input:
# aaabbcdddd

# Output:
# a3b2c1d4

class CompressString:
    def CompressStringMethods(inputstring):
        for i in range(len(inputstring)):
            count=1
            found=False
            for j in range(i):
                if(inputstring[i]==inputstring[j]):
                    found=True
                    break
            if(found):
                continue

            
            for k in range(i+1,len(inputstring)):
                if(inputstring[k]==inputstring[i]):
                    count=count+1
            print(inputstring[i]+str(count),end="")
        print()

    
inputstring="aaabbcdddd"
CompressString.CompressStringMethods(inputstring)