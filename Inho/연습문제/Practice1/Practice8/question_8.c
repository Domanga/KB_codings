#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main(void) {
	int i;
	int random = 0, sum = 0;
	int num = 0;

	srand(time(NULL));
	printf("임의의 정수를 입력하세요 : ");
	scanf("%d", &num);
	printf(" 0~%d 사이의 임의의 정수를 10개 생성해서 합계를 구합니다.\n", num - 1);
	
	for (i = 0; i < 10; i++) {
		random = rand() % num;
		printf("%3d", random);
		sum += random;
	}

	printf("\n");
	printf("합계 : %d\n", sum);

	return 0;
}