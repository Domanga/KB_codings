#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int is_leep_year(int year){
	int i;
	
	if (((year % 4) == 0) && ((year % 100) != 0)) {
		return 1;
	}
	else 
		return 0;
}

int main(void) {
	int i;
	int year_s, year_e;
	int leap_year;

	printf("시작 년도와 마지막 년도를 입력하세요 : ");
	scanf("%d%d", &year_s, &year_e);

	printf("%d ~ %d 사이의 윤년\n", year_s, year_e);

	for (i = year_s; i <= year_e; i++) {
		leap_year = is_leep_year(i);
		if (leap_year == 1) {
			printf("%5d", i);
		}
	}

	return 0;
}