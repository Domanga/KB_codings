#define _CRT_SECURE_NO_WARNINGS 
#include <stdio.h>

int main(void) {

	int a, b;
	char ch;

	printf("¼ö½Ä : ");
	scanf("%d%c%d", &a, &ch, &b);

	if (ch == '+') {
		printf("%d + %d = %d", a, b, a + b);
	}
	else if (ch == '-') {
		printf("%d - %d = %d", a, b, a - b);
	}
	else if (ch == '*') {
		printf("%d * %d = %d", a, b, a * b);
	}
	else if (ch == '/') {
		printf("%d / %d = %d", a, b, a / b);
	}
	else {
		printf("error\n");
	}
	return 0;
}