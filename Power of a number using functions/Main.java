#include<stdio.h>
int power(int b,int e)
{
  int s=1;
  while(e!=0)
  {
    s=s*b;
    e--;
  }
  return s;
}
int main(){
  int b,e;
  scanf("%d %d",&b,&e);
  int p=power(b,e);
  printf("%d",p);
    // Type your code here
  	return 0;
}