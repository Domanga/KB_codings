#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int reverse_string(char* array) {
	char temp = "";
	for (int i = 0; i < strlen(array) / 2; i++) {
		temp = array[i];
		array[i] = array[(strlen(array) - 1) - i];
		array[(strlen(array) - 1) - i] = temp;
	}
}

int main() {
	char sentence[128] = "";
	char* p = sentence;

	printf("¹®ÀÚ¿­? : ");
	gets_s(sentence, sizeof(sentence));

	reverse_string(p);

	puts(sentence);
	return 0;
}