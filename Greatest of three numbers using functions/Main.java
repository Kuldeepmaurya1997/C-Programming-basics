#include <stdio.h>
int greatest(n1,n2,n3)
{
  if(n1>n2 && n1>n3)
    return n1;
  else if(n2>n1 && n2>n3)
    return n2;
  else
    return n3;
}
int main(){
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  printf("%d",greatest(n1,n2,n3));
  	return 0;
}