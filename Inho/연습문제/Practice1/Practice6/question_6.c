#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int choose_menu() {
	int menu = 0;

	printf("[1.���� ���� 2.���� ���� 3.�μ� 0.����] ����? ");
	scanf("%d", &menu);

	if (menu >= 4) {
		printf("[1.���� ���� 2.���� ���� 3.�μ� 0.����] ����? ");
		scanf("%d", &menu);
	}

	return menu;
}

int main(void) {
	int menu=5;

	menu = choose_menu();

	while (menu != 0) {
		
		switch (menu)
		{
		case 1:
			printf("���� ���⸦ �����մϴ�.\n");
			break;
		case 2:
			printf("���� ������ �����մϴ�.\n");
			break;
		case 3:
			printf("�μ⸦ �����մϴ�.\n");
			break;
		default:
			break;
		}
		menu = choose_menu();
	}

	printf("���α׷��� �����մϴ�.\n");

	return 0;
}