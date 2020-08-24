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

	printf("가로? :");
	scanf("%d", &a);
	printf("세로? :");
	scanf("%d", &b);
	printf("직사각형의 둘레 : %d\n", get_perimeter(a, b));

	return 0;
}