#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int a, b;
	char op;
	char flag = 'Y';

	while (flag == 'Y' || flag == 'y') {
		printf("수식을 입력하세요 : ");
		scanf("%d%c%d", &a, &op, &b);

		switch (op)
		{
		case '+':
			printf("%d + %d = %d", a, b, a + b);
			break;
		case '-':
			printf("%d - %d = %d", a, b, a - b);
			break;
		case '*':
			printf("%d * %d = %d", a, b, a * b);
			break;
		case '/':
			if (b != 0) {
				printf("%d / %d = %d", a, b, a / b);
			}
			else {
				printf("0으로 나눌 수 없습니다.");
			}
			break;
		default:
			printf("error!");
			break;
		}
		printf("\n계속 하시겠습니까(y/n)? :");
		scanf(" %c", &flag);
	}
	printf("\n프로그램을 종료합니다... \n\n ");
	return 0;
}