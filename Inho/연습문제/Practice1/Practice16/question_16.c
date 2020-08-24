#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

void graph(int number, int scale) {
	char ch = '*';
	int i, value;

	value = number / scale;
	printf("%d : ", number);

	for (i = 0; i < value; i++) {
		printf("%c", ch);
	}

	printf("\n");
}

int main(void) {
	int i, number;
	int scale = 100;

	srand(time(NULL));

	for (i = 0; i < 3; i++) {
		number = rand() % 1000;
		graph(number, scale);
	}
	return 0;
}