#include <stdio.h>

int main(void) {
	double x1, y1;
	double x2, y2;
	double width = 0;

	printf("첫 번째 좌표를 입력하세요 : ");
	scanf_s("%lf %lf", &x1, &y1);
	printf("\n");

	printf("두 번째 좌표를 입력하세요 : ");
	scanf_s("%lf %lf", &x2, &y2);
	printf("\n");

	if (x1 != x2 && y1 != y2) {

		if (x1 > x2 && y1 > y2) {
			width = (x1 - x2) * (y1 - y2);
		}
		else if (x1 > x2 && y1 < y2) {
			width = (x1 - x2) * (y2 - y1);
		}
		else if (x1 < x2 && y1 > y2) {
			width = (x2 - x1) * (y1 - y2);
		}
		else {
			width = (x2 - x1) * (y2 - y1);
		}
		printf("입력하신 좌표는 (%lf, %lf), (%lf, %lf) 입니다.\n", x1, y1, x2, y2);
		printf("두 점이 이루는 직사각형의 넓이는 : %lf\n", width);
	}
	else {
		printf("두 점의 위치가 동일해 넓이를 구할 수 없습니다.\n");
	}

	return 0;
}