#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int get_perimeter(int x, int y) {
	int result = 0;

	result = 2 * (x + y);

	return result;
}

int main(void) {
	int a, b;

	printf("����? :");
	scanf("%d", &a);
	printf("����? :");
	scanf("%d", &b);
	printf("���簢���� �ѷ� : %d\n", get_perimeter(a, b));

	return 0;
}