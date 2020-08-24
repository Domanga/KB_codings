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

		printf("%d번째 고객 입력\n", num+1);

		printf("\n고객 번호 :");
		scanf_s("%d", &(Arr[num].cusNum));

		printf("\n고객 이름 : ");
		scanf_s("%s", Arr[num].cusName,10);

		printf("\n고객 가입일 입력 : ");
		scanf_s("%s", Arr[num].regDate,20);

		printf("\n");
	}

	for (num = 0; num < SIZE; num++) {

		printf("고객 번호 : %d\n", Arr[num].cusNum);
		printf("고객 이름 : %s\n", Arr[num].cusName);
		printf("고객 가입일 : %s\n", Arr[num].regDate);
		printf("\n");
	}
	
	printf("검색하고자 하는 고객의 번호를 입력하세요 : ");
	scanf_s("%d", &res);
	for (num = 0; num < SIZE; num++) {

		if (res == Arr[num].cusNum) {
			result = num;
		}
	}
	printf("검색 결과\n");
	printf("===================\n");
	printf("고객 번호 : %d\n", Arr[result].cusNum);
	printf("고객 이름 : %s\n", Arr[result].cusName);
	printf("고객 가입일 : %s\n", Arr[result].regDate);
	return 0;
}