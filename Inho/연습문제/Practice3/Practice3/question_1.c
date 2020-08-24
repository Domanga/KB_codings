#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main() {
	char sentence[128] = "";
	int count = 0;
	printf("문자 열? : ");
	gets_s(sentence, sizeof(sentence));
	puts(sentence);

	for (int i = 0; i < 128; i++) {
		if (sentence[i] == ' ') { 
			count++;
		}
	}

	printf("문장에서 공백은 %d개 입니다. \n", count);
	return 0;
}