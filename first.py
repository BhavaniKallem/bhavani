sum1=0
num=int(input("Enter a number:"))
temp=num
while(num>0):
    
    f=1
    r=num%10
    for i in range(1,r+1):
        f=f*i
    sum1=sum1+f
    num=num//10
if(sum1==temp):
    print("The number is a strong number")
else:
    print("The number is not a strong number")
    