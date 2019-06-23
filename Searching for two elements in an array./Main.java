#include<stdio.h>
int main()
{
  int a[10],n,s1,s2,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d %d",&s1,&s2);
  int c1=-1,c2=-1;
  for(i=0;i<n;i++)
  {
    if(s1==a[i])
    {
      c1=i; 
    }
    if(s2==a[i])
    {
      c2=i;
    }
  }
  printf("%d\n",c1);
  printf("%d\n",c2);

  return 0;
}