#include<stdio.h>
int square(int n)
{
  return n*n;
}
int main() {
  int n;
  scanf("%d",&n);
  int sq=square(n);
  printf("%d",sq);
   // Type your code here
   return 0;
}