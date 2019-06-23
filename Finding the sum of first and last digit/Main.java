#include <stdio.h>
int main()
{
  int n,sum,count=0;
  scanf("%d",&n);
  int s=n;
  int l=n%10;
  while(n>0)
  {
    n=n/10;
    count++;
  }
  while(count-1>0)
  {
    s=s/10;
    count--;
  }
 sum=s+l;
  printf("%d",sum);
	return 0;
}