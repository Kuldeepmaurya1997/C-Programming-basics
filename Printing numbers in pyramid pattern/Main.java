#include<stdio.h>
int main()
{
  int n,r,c,s,i=1;
  scanf("%d",&n);
  for(r=1;r<=n;r++)
  { 
    for(s=1;s<=n-r;s++)
    {
      printf(" ");
    }
    for(c=1;c<=r;c++)
    {
      printf("%d ",i);
      i++;
    }
    printf("\n");
  }
//Try out your code here
return 0;
}
