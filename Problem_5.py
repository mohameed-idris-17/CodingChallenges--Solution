n1 = int(input())

n2 = int(input())

carry, UD1, UD2, count=0,0,0,0

while(n1>0 or n2>0):

    UD1=n1%10

    n1/=10

    UD2=n2%10

    n2/=10

    if(((UD1+UD2+carry))>10):

        count=count+1

    carry=UD1+UD2+carry/10

print(count)