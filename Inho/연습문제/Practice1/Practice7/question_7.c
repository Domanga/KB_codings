#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int is_prime(int number) {
	int i, j;
	int count = 0;

	for (i = 1; i < number; i++) {

		for (j = 2; j < i; j++) {
			if (i % j == 0) {
				break;
			}
		}

		if (j == i) {
			printf("%3d", j);
			count++;
		}
	}

	printf("\n");

	return count;
}

int main(void) {
	int prime, count;

	printf(" 1~N ������ �Ҽ��� ���մϴ�. N�� �Է��ϼ���. : ");
	scanf("%d", &prime);

	count = is_prime(prime);

	printf(" �Ҽ��� ��� %d���Դϴ�.\n", count);

	return 0;
}