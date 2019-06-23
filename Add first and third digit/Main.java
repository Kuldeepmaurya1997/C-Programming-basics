#include<stdio.h>
int main()
{
  //Type your code here
  int n,a,b;
  scanf("%d",&n);
  b=n%10;
  a=n/100;
  printf("%d",a+b);
  return 0;
}