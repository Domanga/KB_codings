#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

void divisor(int number) {
	int i, count = 0;

	printf("%3d�� ��� : ", number);
	for (i = 2; i <= number; i++) {	
		if (number % i == 0) {
			printf(" %2d ", i);
			count++;
		}
	}
	printf("  => �� %d��\n", count);
}

int main(void) {
	int i, number;

	srand(time(NULL));   // �Ź� ������ ����

	for (i = 0; i < 3; i++) {
		number = rand() % 1000;	
		divisor(number);
	}
	return 0;
}