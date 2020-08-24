#include <stdio.h>

void test1(int a) {
	a = 30;
}

void test2(int* p) {
	*p = 30;
}

int main() {
	int* p2 = (int*)0x12345678;

	int a = 10;
	int* p3 = &a;

	int* p4 = 0;
	int* p5 = NULL;

	printf("p2 = %p\n", p2);
	printf("p3 = %p\n", p3);
	printf("p4 = %p\n", p4);
	printf("p5 = %p\n", p5);
	
	*p3 = 20;

	printf("a = %d\n", a);
	printf("*p3 = %d\n", *p3);
	printf("&a = %p\n", &a);
	
	test1(a);
	printf("a = %d\n", a);
	printf("*p3 = %d\n", *p3);

	test2(&a);
	printf("a = %d\n", a);
	printf("*p3 = %d\n", *p3);

	return 0;
}