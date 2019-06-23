#include <stdio.h>
int gcd(n1,n2,n3)
{
	int min;
  if(n1<n2 && n1<n3)
    min=n1;
  else if(n2<n1 && n2<n3)
    min=n2;
  else
    min=n3;
  while(min!=0)
  {
    if(n1%min==0 && n2%min==0 && n3%min==0)
    {
      return min;
    }
    else
      min--;
  
  }
}
int main(){
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  printf("%d",gcd(n1,n2,n2));
  	return 0;
}