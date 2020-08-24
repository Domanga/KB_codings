#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int get_rect_info(int* x, int* y, int *width, int *around) {
	*width = (*x) * (*y);
	*around = 2 * (*x + *y);

}

int main() {
	int ver, hor;
	int width = 0, around = 0;
	int* x = &ver, * y = &hor;
	int* w = &width, * a = &around;

	printf("가로? : ");
	scanf("%d", &ver);

	printf("세로? : ");
	scanf("%d", &hor);

	get_rect_info(x, y, w, a);
	//get_rect_info(&ver,&hor, w, a);

	printf("넓이 : %d, 둘레 : %d",*w, *a);

	return 0;
}