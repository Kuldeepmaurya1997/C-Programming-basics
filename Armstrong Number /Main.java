#include <stdio.h>
int main() {
	//Type your code
  int n,r,sum=0;
  scanf("%d",&n);
  int c=n;
  while(n>0)
  {
    r=n%10;
    sum=sum+r*r*r;
    n=n/10;
  }
  if(c==sum)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}