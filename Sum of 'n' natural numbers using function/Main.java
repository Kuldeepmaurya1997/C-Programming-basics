#include<stdio.h>
int sum(int n)
{
  int i,s=0;
  for(i=1;i<=n;i++)
  {
    s+=i;
  }
  return s;
}
int main() {
  int n;
  scanf("%d",&n);
  int sm=sum(n);
  printf("%d",sm);
    // Type your code here
  	return 0;
}