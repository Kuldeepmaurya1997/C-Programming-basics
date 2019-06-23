#include<stdio.h>
int main()
{
  //Type your code here
  int length=6;
  int breadth=9;
  int perimeter=2*(length+breadth);
  int area=length*breadth;
  printf("The perimeter of the rectangle is: %d cm\n",perimeter);
  printf("The area of the rectangle is: %d sq cm",area);
  return 0;
}