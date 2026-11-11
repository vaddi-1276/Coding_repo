#  Input:
#  listen
#  silent

#  Output:
#  Frequency Match = Yes
#  Anagram = Yes

class CheckAnagramFrequencyMatch:
    def CheckAnagramFrequencyMatchMethods(str1,str2):

        arr1=list(str1)
        arr2=list(str2)

        for i in range(len(arr1)):
            for j in range(i+1,len(arr1)):
                if(arr1[i]>arr1[j]):
                    temp=arr1[i]
                    arr1[i]=arr1[j]
                    arr1[j]=temp

        print(arr1)

        for i in range(len(arr2)):
            for j in range(i+1,len(arr2)):
                if(arr2[i]>arr2[j]):
                    temp=arr2[i]
                    arr2[i]=arr2[j]
                    arr2[j]=temp

        print(arr2)

        if(len(arr1)!=len(arr2)):
            print("Not Anagram")
            return

        for i in range(len(arr1)):

            if(arr1[i]!=arr2[i]):
                print("Not Anagrams because Values are not Equals")
                return

        print("Frequency Match = Yes")
        print("Anagram = Yes")

        
str1="listen"
str2="appear"
CheckAnagramFrequencyMatch.CheckAnagramFrequencyMatchMethods(str1,str2)