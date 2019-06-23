#include<stdio.h>
int main()
{
  int n,i,a[20],num=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);

  for(i=0;i<n;i++)
  {
  	if(a[i]>0)
  	{
  		a[num++]=a[i];
	}
  }
  while(num<n)
  {
  	a[num++]=0;
  }
	
  for(i=0;i<num;i++)
  {
  	printf("%d ",a[i]);
  }
  return 0;
}