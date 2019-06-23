#include <stdio.h>
int main() {
	//Type your code
  int n,r,i,s=0,f;
  scanf("%d",&n);
  int c=n;
  while(n>0)
  {
    r=n%10;
    f=1;
    for(i=1;i<=r;i++)
	{
		f=f*i;
	}
	s=s+f;
    n=n/10;
  }
  if(s==c)
	{
	printf("Yes");
	}
  else
	{
	  printf("No");
	}
	return 0;
}