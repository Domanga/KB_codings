#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int is_even(int num) {
	if ((num != 0) && (num % 2 == 0)) {
		return 2;
	}
}

int is_odd(int num) {
	if (num % 2 != 0) {
		return 1;
	}
}

int main(void) {
	int number = 1;
	int even = 0, odd = 0;

	printf("\n");
	printf("정수를 빈칸으로 구분해서 입력하세요. (마지막에 0 입력)\n");

	while (number != 0) {
		scanf("%d", &number);
		if (is_even(number) == 2) {
			even++;
		}
		if (is_odd(number) == 1) {
			odd++;
		}
	}

	printf("입력받은 정수 중 짝수는 %d개, 홀수는 %d개입니다.\n", even, odd);

	return 0;
}