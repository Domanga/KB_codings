#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int get_days_of_month(int year, int month) {
	int days;

	switch (month)
	{
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		days = 31;
		return days;
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		days = 30;
		return days;
		break;
	case 2:
		if (year % 4 == 0 && year % 100 != 0) {
			days = 29;
		}
		else days = 30;
		return days;
		break;
	default:
		break;
	}
}

int main(void) {
	int year, month, days;

	printf("연도? ");
	scanf("%d", &year);
	printf("[ %d년 ]\n", year);

	for (month = 1; month <= 12; month++) {
		days = get_days_of_month(year, month);
		printf("%2d월: %2d일 ", month, days);
	}

	return 0;
}