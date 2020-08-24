#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int round_pos(int number, int index) {
	int result;
	int a;
	int pos = (pow(10, index));
	int temp;

	a = 0.5 * pos;
	temp = (number + a) / pos;
	result = temp * pos;

	return result;
}

int main(void) {
	int pos, number, result;

	printf("숫자를 입력하세요. : ");
	scanf("%d", &number);

	for (pos = 1; pos < 4; pos++) {
		result = round_pos(number, pos);
		printf("%d번째 자리에서 반올림한 결과 : %d\n", pos, result);
	}

	return 0;
}