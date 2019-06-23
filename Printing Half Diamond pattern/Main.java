#include<stdio.h>
int main()
{
  int n,r,c,s;
  scanf("%d",&n);
  for(r=1;r<=n;r++)
  { 
    for(s=1;s<=n-r;s++)
    {
      printf(" ");
    }
    for(c=1;c<=r+(r-1);c++)
    {
      printf("*");
    }
    printf("\n");
  }
//Try out your code here
return 0;
}
