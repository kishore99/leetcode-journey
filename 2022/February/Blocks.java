public class HelloWorld{

public static void main(String []args){
int t = 30;
int[] a = {185,7};
System.out.println(myMethod(2,t,a));
}

public static int myMethod(int N, int K,int[] Arr,) {
int ans = 0;
for(int i=0;i<t;i++) {
arr = update(arr);
}

int max = arr[0];
int min = arr[0];

for(int i=1;i<arr.length;i++) {
if(arr[i] < min)
min = arr[i];

if(arr[i] > max)
max = arr[i];

}
return max - min;
}

static int[] update(int[] arr) {
int max = arr[0];
int min = arr[0];
int maxInd = 0;
int minInd = 0;
for(int i=1;i<arr.length;i++) {
if(arr[i] < min) {
min = arr[i];
minInd = i;
}

if(arr[i] > max) {
max = arr[i];
maxInd = i;
}
}
arr[minInd] += 1;
arr[maxInd] -= 1;
return arr;
}
}
