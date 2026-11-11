# Input: 122333444455555666666

# Output:
# 1 = 2
# 2 = 2
# 3 = 2
# 4 = 2
# 5 = 2

class CountOccurrencesofEachDigit:
    def CountOccurrencesofEachDigitMethods(num):
        for i in range(len(num)):
            found=False
            for j in range(i):
                if(num[i]==num[j]):
                    found=True
                    break
            if(found):
                continue

            count=1

            for k in range(i+1,len(num)):
                if(num[k]==num[i]):
                    count
                    count=count+1
            print(num[i]," = ",str(count))




num="112223333444445555556666666"
CountOccurrencesofEachDigit.CountOccurrencesofEachDigitMethods(num)