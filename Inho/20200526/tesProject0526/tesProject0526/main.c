#include <stdio.h>

int main(void) {
	double x1, y1;
	double x2, y2;
	double width = 0;

	printf("ù ��° ��ǥ�� �Է��ϼ��� : ");
	scanf_s("%lf %lf", &x1, &y1);
	printf("\n");

	printf("�� ��° ��ǥ�� �Է��ϼ��� : ");
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
		printf("�Է��Ͻ� ��ǥ�� (%lf, %lf), (%lf, %lf) �Դϴ�.\n", x1, y1, x2, y2);
		printf("�� ���� �̷�� ���簢���� ���̴� : %lf\n", width);
	}
	else {
		printf("�� ���� ��ġ�� ������ ���̸� ���� �� �����ϴ�.\n");
	}

	return 0;
}