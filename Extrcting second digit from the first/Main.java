#include <stdio.h>
int main()
{
  int n,sec,count=0;
  scanf("%d",&n);
  int s=n;
  while(n>0)
  {
    n=n/10;
    count++;
  }
  while(count-2>0)
  {
    s=s/10;
    count--;
  }
  sec=s%10;
  printf("%d",sec);
	return 0;
}