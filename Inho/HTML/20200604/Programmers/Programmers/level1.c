#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>


int solution(int num) {
	int answer = 0;
	int i = 0;
	int count = 0;

	for (i = 1; i < num; i++) {
		if (num % i == 0) {
			printf("%5d", i);
			answer += i;
		}
	}

	return answer;
}
int main() {
	int abc = 0;
	int result = 0;

	printf("숫자를 입력하세용\n");
	scanf("%d", &abc);

	result = solution(abc);

	printf(" --> %5d", result);

	return 0;
}