#include<stdio.h>
int main()
{
  int n,r,c;
  scanf("%d",&n);
  int i;
  for(r=1;r<=n;r++)
  { 
    i=n-(r-1);
    for(c=1;c<=(n-(r-1));c++)
    {
      printf("%d",i);
      i--;
    }
    printf("\n");
  }
//Try out your code here
return 0;
}
