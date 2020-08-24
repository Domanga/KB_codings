#define _CRT_SECURE_NO_WARNINGS 
#include <stdio.h>

int main(void) {

	int a, b;
	char ch;

	printf("¼ö½Ä : ");
	scanf("%d%c%d", &a, &ch, &b);

	switch (ch)
	{
	case '+':
		printf("%d + %d = %d\n", a, b, a + b);
		break;
	case '-':
		printf("%d - %d = %d\n", a, b, a - b);
		break;
	case '*':
		printf("%d * %d = %d\n", a, b, a * b);
		break;
	case '/':
		printf("%d / %d = %d\n", a, b, a / b);
		break;
	default:
		printf("error");
		break;
	}
	return 0;
}