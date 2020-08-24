#define	_CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int choose_menu() {
	int menu = 0;

	printf("[1.파일 열기 2.파일 저장 3.인쇄 0.종료] 선택? ");
	scanf("%d", &menu);

	if (menu >= 4) {
		printf("[1.파일 열기 2.파일 저장 3.인쇄 0.종료] 선택? ");
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
			printf("파일 열기를 수행합니다.\n");
			break;
		case 2:
			printf("파일 저장을 수행합니다.\n");
			break;
		case 3:
			printf("인쇄를 수행합니다.\n");
			break;
		default:
			break;
		}
		menu = choose_menu();
	}

	printf("프로그램을 종료합니다.\n");

	return 0;
}