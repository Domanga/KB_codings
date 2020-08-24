#include<stdio.h>
#define SIZE 10

int main() {
	int x[SIZE] = { 44,32,65,23,45,76,77,89,23,45 };
	int* p = x;

	printf("배열 :");

	for (int i = 0; i < SIZE; i++, p++) {
		printf("%3d", *p);
	}

	printf("\n역순 :");

	p = &x[SIZE-1];

	for (int i = 0; i < SIZE; i++, p--) {
		printf("%3d", *p);
	}

	return 0;
}