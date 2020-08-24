#define _CRT_SECURE_NO_WRANINGS
#include <stdio.h>
#include <stdbool.h>

int primeNum(int num) {
	int i, j;
	bool flag = true;
	j = num;
	for (i = 2; i < j; i++) {
		if (num % i == 0) {
			flag = false;
			return flag;
		}
	}
	return flag;
}

int main(void) {

	int i, j, k;
	int number = 2;
	int num = 257;
	for (i = 0; i < 10; i++) {

		for (j = 0; j < 10-i; j++) {
			printf("  ");
		}
		for (k = 0; k <= i; number++) {
			if (primeNum(number)) {
				printf("%5d", number);
				k++;
			}
		}
		printf("\n");
	}
	printf("\n\n");
	for (i = 0; i < 10; i++) {
		for (j = 0; j < i; j++) {
			printf("  ");
		}
		for (k = 9; k >= i; num--) {
			if (primeNum(num)) {
				printf("%5d", num);
				k--;
			}
		}
		printf("\n");
	}
	return 0;
}


