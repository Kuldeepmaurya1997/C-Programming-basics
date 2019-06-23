#include<stdio.h>
void prime(int n)
{
  int i,j,c;
  for(i=1;i<=n;i++)
  {
    c=0;
    for(j=1;j<=i;j++)
    {
      if(i%j==0)
      {
        c++;
      }
    }
    if(c==2)
    {
      printf("%d\n",i);
    }
}
}
int main(){
  int n;
  scanf("%d",&n);
  prime(n);
    // Type your code here
   return 0;
}