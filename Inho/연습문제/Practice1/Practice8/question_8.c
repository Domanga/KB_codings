#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main(void) {
	int i;
	int random = 0, sum = 0;
	int num = 0;

	srand(time(NULL));
	printf("������ ������ �Է��ϼ��� : ");
	scanf("%d", &num);
	printf(" 0~%d ������ ������ ������ 10�� �����ؼ� �հ踦 ���մϴ�.\n", num - 1);
	
	for (i = 0; i < 10; i++) {
		random = rand() % num;
		printf("%3d", random);
		sum += random;
	}

	printf("\n");
	printf("�հ� : %d\n", sum);

	return 0;
}