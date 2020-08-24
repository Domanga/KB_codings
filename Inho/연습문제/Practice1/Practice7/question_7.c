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

	printf(" 1~N 사이의 소수를 구합니다. N을 입력하세요. : ");
	scanf("%d", &prime);

	count = is_prime(prime);

	printf(" 소수는 모두 %d개입니다.\n", count);

	return 0;
}