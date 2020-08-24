#define _CRT_SECURE_NO_WRANINGS
#include <stdio.h>

int prime(int num);

int main(void) {

	int i, j,k;
	int num = 2;
	
	for (i = 0; i < 10; i++) {

		for (j = i; j < 9; j++) {
			printf(" ");
		}
		for (j = 0; j < i; num++) {
			if (prime(num) == 1) {
				printf("%2d", num);
				j++;
			}

		}
		printf("\n");
	}
	int number = 10;
	for (i = 0; i < 10; i++) {
		for (j = 0; j < i; j++) {
			printf("  ");
		}
		for (j = (number * 2)-1; j > 2*i; j--) {
			printf(" *");
		}
		printf("\n");
	}

	return 0;
}

int prime(int num) {
	int i, j;
	j = num;
	for (i = 2; i < j; i++) {
		if (num % i == 0) {
			return 0;
		}
	}
	return 1;
}
