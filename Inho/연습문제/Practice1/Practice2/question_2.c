#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

double get_area_of_square(double x) {
	double result = 0.0;

	result = x * x;

	return result;
}

int main(void) {
	double c;

	printf("�� ���� ����? :");
	scanf("%lf", &c);
	printf("���簢���� ���� : %lf\n", get_area_of_square(c));

	return 0;
}