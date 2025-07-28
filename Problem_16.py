num = int(input())
arr = list(map(int,input().strip().split(" ")
total  =0
if(num%2==1):
               print(-1)
               sys.exit()
else{
        for i in range(0,num,2):
               sub = arr[i+1] - arr[i]
               total+=sub
}
print(total)
