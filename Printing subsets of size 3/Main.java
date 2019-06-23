#include<stdio.h>
int main()
{
       int arr_size,i,j,l,k;
       scanf("%d",&arr_size);
       int arr[10];
       for(i = 0; i <= arr_size - 1; i++)
       {
          scanf("%d",&arr[i]) ;
       }
        for(j = 0; j <= arr_size - 2; j++)
        {
            for(k = j + 1; k <= arr_size - 1; k++)
            {
                for(l = k + 1; l <= arr_size - 1; l++)
                {
                    printf("(%d, %d, %d) ",arr[j],arr[k],arr[l]);
                }
            }
            printf("\n");
        }
    return 0;
}