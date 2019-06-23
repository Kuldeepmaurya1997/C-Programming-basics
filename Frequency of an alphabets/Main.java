#include<stdio.h>
#include<string.h>
int main()
{
	char str[100];
	int arr[26]={0},i=0,indx=0;
	
	scanf("%[^\n]s",str);
	
	while(str[i]!='\0')
	{
		if(str[i]>='a' && str[i]<='z')
		{
			indx=str[i]-'a';
			arr[indx]++;	
		}
		i++;
	}
	for(i=0;i<26;i++)
	{
		if(arr[i]!=0)
		{
			printf("%c%d ",i+'a',arr[i]);
			arr[i]=0;
		}
	}
	return 0;
}