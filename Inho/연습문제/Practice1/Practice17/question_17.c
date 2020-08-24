#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

double electric_charge(double amount) {
	double sum;
	double basic_1 = 910, basic_2 = 1600, basic_3 = 7300;
	double std_1 = 1, std_2 = 200, std_3 = 400;
	double charge_1 = 93.3, charge_2 = 187.9, charge_3 = 280.6;

	if (amount <= 200) {
		sum = basic_1 + (charge_1 * amount);
	}
	else if (amount > 200 && amount <= 400) {
		sum = (charge_1 * std_2) + basic_2 + (charge_2 * (amount - std_2));
	}
	else if (amount > 400) {
		sum = (charge_1 * std_2) + (charge_2 * (std_3 - std_2)) + basic_3 + ((charge_3) * (amount - std_3));
	}

	return sum;
}

int main(void) {
	double amount = 0;
	int price = 0;

	while (1) {
		printf("월 사용량 (kwh)? ");
		scanf("%lf", &amount);
		if (amount == -1) break;
		price = electric_charge(amount);
		printf("전기 요금:  %d원\n", price);
	}

	printf("프로그램을 종료합니다.\n");

	return 0;
}