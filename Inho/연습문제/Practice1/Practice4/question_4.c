#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int discount_price(int price, double rate) {
	int sum;

	sum = price * rate;

	return price - sum;
}

int main(void) {
	double a, rate;
	int sum, price = 1;

	printf("������(%%)? :");
	scanf("%lf", &a);

	rate = a / 100;

	while (price != 0) {
		printf("��ǰ�� ����? :");
		scanf("%d", &price);
		sum = discount_price(price, rate);
		printf("���ΰ� : %d\n", sum);
	}

	return 0;
}