#include<stdio.h>
int main()
{
//Try out your code here
  int n,i;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d",i);
    if(i%3==0 && i!=n)
    {
      printf(",");
    }
  }
return 0;
}
