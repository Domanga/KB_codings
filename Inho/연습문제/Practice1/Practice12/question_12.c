#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int check_date(int year, int month, int days) {
	if (month > 12) {
		return 0;
	}
	else {
		switch (month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (days > 31) {
				return 0;
			}
			else return 1;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (days > 30) {
				return 0;
			}
			else return 1;
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0) {
				if (days > 29) {
					return 0;
				}
				else return 1;
			}
			else {
				if (days > 30) {
					return 0;
				}
				else return 1;
			}
			break;
		default:
			break;
		}
	}
}

int main(void) {
	int year, month, days;
	int flag = 1;

	printf("날짜 (연 월 일)? ");
	scanf("%d%d%d", &year, &month, &days);

	while (1) {
		flag = check_date(year, month, days);
		if (flag == 1) {
			printf("입력한 날짜는 %d년 %d월 %d일입니다.\n", year, month, days);
			break;
		}
		else {
			printf("잘못 입력하셨습니다. 유효한 날짜를 입력하세요.\n");
			printf("날짜 (연 월 일)? ");
			scanf("%d%d%d", &year, &month, &days);
		}
	}

	return 0;
}