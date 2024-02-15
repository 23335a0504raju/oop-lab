#include<stdio.h>
int main() {
	int num1,num2,result,m,n;
	char ch;
	printf("enter the type of operation : ");
	scanf("%c",&ch);
	printf("Enter any two numbers : ");
	scanf("%d%d",&m,&n);
	
	switch(ch) 
	{
		case '+':
		result=num1+num2;
		break;
		case '-':
		result=num1-num2;
		break;
		case '*':
		result=num1*num2;
		break;
		case '/':
		result=num1/num2;
		break;
	}
	printf("the required output is: %d",result);
	return 0;
}
