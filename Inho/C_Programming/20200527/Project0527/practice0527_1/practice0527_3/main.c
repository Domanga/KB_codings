#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int num = 0;
	int sum_1 = 0, sum_2 = 0;
	int i = 0, j = 0;

	printf("���� 5���� �Է��ϼ���. ");
	for (i = 0; i < 5; ++i) {
		scanf("%d", &num);
		sum_1 += num;
	}
	printf("�հ�� : %d", sum_1);
	printf("\n");

	printf("���� 5���� �Է��ϼ���. ");
	while (j<5)
	{
		scanf("%d", &num);
		sum_2 += num;
		j++;
	}
	printf("�հ�� : %d", sum_2);
	printf("\n");

	int width, height;
	char ch;

	printf("\n Enter width, height of square : ");
	scanf("%d%d", &width, &height);
	printf("\n Enter Character : ");
	scanf(" %c", &ch);

	for (i = 0; i < height; ++i) {
		for (j = 0; j < width; ++j) {
			printf("%c", ch);
		}
		printf("\n");
	}

	return 0;
}