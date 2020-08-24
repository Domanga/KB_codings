#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int get_quadrant(int posx, int posy) {
	int position;

	if (posx == 0) {
		position = 0;
	}
	else if (posy == 0) {
		position = 0;
	}
	else if (posx != 0 && posy != 0) {
		if (posx > 0 && posy > 0) {
			position = 1;
		}
		else if (posx > 0 && posy < 0) {
			position = 2;
		}
		else if (posx < 0 && posy < 0) {
			position = 3;
		}
		else if (posx < 0 && posy >0) {
			position = 4;
		}
	}

	return position;
}

int main(void) {
	int x, y;
	int pos;

	printf("���� ��ǥ (x, y)? ");
	scanf("%d %d", &x, &y);

	while (1) {
		pos = get_quadrant(x, y);
		if (pos == 0) {
			printf("�� ���� ���Դϴ�.\n");
		}
		else printf("%d��и��� ���Դϴ�.\n", pos);
		printf("���� ��ǥ (x, y)? ");
		scanf("%d %d", &x, &y);
	}
	
	return 0;
}