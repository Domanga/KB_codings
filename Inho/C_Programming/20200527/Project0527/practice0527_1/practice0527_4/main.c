#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int a, b;
	char op;
	char flag = 'Y';

	while (flag == 'Y' || flag == 'y') {
		printf("������ �Է��ϼ��� : ");
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
				printf("0���� ���� �� �����ϴ�.");
			}
			break;
		default:
			printf("error!");
			break;
		}
		printf("\n��� �Ͻðڽ��ϱ�(y/n)? :");
		scanf(" %c", &flag);
	}
	printf("\n���α׷��� �����մϴ�... \n\n ");
	return 0;
}