#include <stdio.h>
#define SIZE 3
typedef struct CusInfo {
	int cusNum;
	char cusName[20];
	char regDate[20];
} CusInfo;

int main(void) {
	CusInfo Arr[SIZE];

	int num = 0;
	int res = 0;
	int result = 0;

	for (num = 0; num < SIZE; num++) {

		printf("%d��° �� �Է�\n", num+1);

		printf("\n�� ��ȣ :");
		scanf_s("%d", &(Arr[num].cusNum));

		printf("\n�� �̸� : ");
		scanf_s("%s", Arr[num].cusName,10);

		printf("\n�� ������ �Է� : ");
		scanf_s("%s", Arr[num].regDate,20);

		printf("\n");
	}

	for (num = 0; num < SIZE; num++) {

		printf("�� ��ȣ : %d\n", Arr[num].cusNum);
		printf("�� �̸� : %s\n", Arr[num].cusName);
		printf("�� ������ : %s\n", Arr[num].regDate);
		printf("\n");
	}
	
	printf("�˻��ϰ��� �ϴ� ���� ��ȣ�� �Է��ϼ��� : ");
	scanf_s("%d", &res);
	for (num = 0; num < SIZE; num++) {

		if (res == Arr[num].cusNum) {
			result = num;
		}
	}
	printf("�˻� ���\n");
	printf("===================\n");
	printf("�� ��ȣ : %d\n", Arr[result].cusNum);
	printf("�� �̸� : %s\n", Arr[result].cusName);
	printf("�� ������ : %s\n", Arr[result].regDate);
	return 0;
}