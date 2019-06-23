
#include<stdio.h>
void sum(int n,int a[])
{
  int i,j,s1=0,s2=0;
  int m=n/2;
  for(i=0;i<m;i++)
  {
  	s1+=a[i];
  }
  
  for(j=m;j<n;j++)
  {
  	s2+=a[j];
  }
    
  if(s1==s2)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
}
int main()
{
  int n,i,a[20];
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
  	scanf("%d",&a[i]);
  }
  sum(n,a);
  return 0;
}
