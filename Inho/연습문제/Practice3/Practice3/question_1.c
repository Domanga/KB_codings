#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main() {
	char sentence[128] = "";
	int count = 0;
	printf("���� ��? : ");
	gets_s(sentence, sizeof(sentence));
	puts(sentence);

	for (int i = 0; i < 128; i++) {
		if (sentence[i] == ' ') { 
			count++;
		}
	}

	printf("���忡�� ������ %d�� �Դϴ�. \n", count);
	return 0;
}