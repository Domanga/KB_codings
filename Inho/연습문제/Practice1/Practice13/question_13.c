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

	printf("���ڸ� �Է��ϼ���. : ");
	scanf("%d", &number);

	for (pos = 1; pos < 4; pos++) {
		result = round_pos(number, pos);
		printf("%d��° �ڸ����� �ݿø��� ��� : %d\n", pos, result);
	}

	return 0;
}