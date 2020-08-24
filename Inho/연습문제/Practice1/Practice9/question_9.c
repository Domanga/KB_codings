#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

double carculator(double a, char op, double b) {
	double result = 0.0;

	switch (op)
	{
	case '+':
		result = a + b;
		break;
	case '-':
		result = a * b;
		break;
	case '*':
		result = a * b;
		break;
	case '/':
		if (b != 0) {
			result = a / b;
		}
		else printf("0으로 나눌 수 없습니다.");
		break;
	default:
		printf("잘못 입력하였습니다.");
		break;
	}

	return result;
}

int main(void) {
	double a = 1, b = 1;
	char ch = "";
	double result;

	while (a != 0 && b != 0 && ch != NULL) {
		printf("수식 (0 0 0 입력 시 종료)? : ");
		scanf("%lf %c %lf", &a, &ch, &b);
		result = carculator(a, ch, b);
		printf("%lf\n", result);
	}

	printf("프로그램을 종료합니다.\n");

	return 0;
}