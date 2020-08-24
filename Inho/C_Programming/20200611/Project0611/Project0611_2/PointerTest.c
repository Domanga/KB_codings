#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdio.h>

int main() {
	int a;
	int b;
	int* p = NULL;
	scanf("%d %d", &a, &b);

	if (a > b) {
		p = &a;
	}
	else {
		p = &b;
	}
	*p = *p * 100;


	printf("a = %d \n", a);
	printf("&a = %p \n", &a);

	printf("b = %d \n", b);
	printf("&b = %p \n", &b);

	printf("*p = %d \n", *p);
	printf("p = %p \n", p);
	return 0;
}