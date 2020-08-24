#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int remove_space(char* array) {
	int i = 0, n = 0;
	for (i = 0; i < 128; i++) {
		if (array[i] == ' ') {
			array[i] = array[i + 1];
		}
	}

	//while (array[0] != '\0') {
	//	if (isspace(array[0])) {
	//		array[n] = array[n + 1];
	//	}
	//	array++;
	//	n++;
	//}

}

int main() {
	char sentence[128] = "";
	char* p = sentence;
	char temp[128] = "";
	printf("¹®ÀÚ¿­? : ");
	gets_s(sentence, sizeof(sentence));

	remove_space(sentence);

	puts(sentence);
	return 0;
}