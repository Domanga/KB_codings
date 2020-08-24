#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int Add(int a, int b) {
	return a + b;
}

void print_sum(int count) {
	int i;
	int num;
	int sum = 0;

	printf("%d���� ���� �Է� : ", count);
	for (i = 0; i < count; i++) {
		scanf("%d", &num);
		sum += num;
	}
	printf("�հ� : %d\n", sum);
}

void draw_line(char ch, int a) {
	int i;

	for (i = 0; i < a; i++) {
		printf("%c", ch);
	}
	printf("\n");
}

void get_factorial(int num) {
	int i;
	int result = 1;
	
	if (num != 0) {
		for (i = 1; i <= num; i++) {
			result *= i;
		}
		printf("%d! = %d", num, result);
	}
	else printf("0! = 0");
	printf("\n");
}

int GCD(int x, int y) {
	int r;
	while (y != 0) {
		r = x % y;
		x = y;
		y = r;
	}
	return x;
}

int main(void) {
	int i;
	int result;
	int x, y;
	result = Add(3, 4);
	printf("��� 1 = %d\n", result);
	result = Add(15, 27);
	printf("��� 2 = %d\n", result);

	draw_line('*', 25);

	for (i = 2; i < 10; i += 2) {
		print_sum(i);
	}

	draw_line('*', 25);

	for (i = 0; i < 6; i++) {
		get_factorial(i);
	}

	draw_line('*', 25);

	printf("�� ������ �Է��ϼ��� :");
	scanf("%d%d", &x, &y);
	printf("%d�� %d�� �ִ� ������� : %d\n", x, y, GCD(x, y));

	return 0;
}