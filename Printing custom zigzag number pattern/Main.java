#include <stdio.h>
int main() {
	// Type your code here
  int n,r,c,i,num=2;
  scanf("%d",&n);
  for(r=1;r<=n;r++)
  {
    for(c=1;c<=n;c++)
    {
      if(r%2==1 && c!=n)
      {
        printf("%d",r);
      }
      else if(r%2==1 && c==n)
      {
      	printf("%d",num);
		num++; 
	  }
      else
      {
      	if(c==1)
      	{
      	    printf("%d",num);
			num++; 	
		}
		else
			printf("%d",r);  
      }
    }
    printf("\n");
  }
	return 0;
}