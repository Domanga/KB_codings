#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

double distance(int x1, int y1, int x2, int y2) {
	int a = x2 - x1, b = y2 - y1;

	double result = sqrt((a * a) + (b * b));
	return result;
}

int main(void) {
	int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
	double dis;

	printf("직선의 시작점 좌표? :");
	scanf("%d%d", &x1, &y1);
	printf("직선의 끝점 좌표? : ");
	scanf("%d%d", &x2, &y2);
	dis = distance(x1, y1, x2, y2);
	printf("(%d, %d)~(%d, %d) 직선의 길이 : %lf\n", x1, y1, x2, y2, dis);

	return 0;
}