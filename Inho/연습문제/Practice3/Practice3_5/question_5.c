#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int strcmp_ic(char* a, char* b) {
	int i = 0, count = 1;
	for (int i = 0; i < strlen(a); i++)
	{
		if (islower(a[i])) {
			a[i] = toupper(a[i]);
		}
		if (islower(b[i])) {
			b[i] = toupper(b[i]);
		}

	}
	puts(a);
	puts(b);
	for(i=0;i<10;i++ ){
		if (a[i] == '\0' || b[i] == '\0') {
			break;
		}
		else {
			if (a[i] == b[i]) {
				count = 0;
			}
			else {
				count = 1;
				break;
			}
		}
	}
	return count;
	/*for (int i = 0; i < strlen(a); i++)
	{
		if (a[i] == b[i]) {
			return count = 0;
		}
		else return count = 1;
	}*/
}


int main() {
	char sentence1[32] = " ";
	char sentence2[32] = " ";
	char* p = sentence1;
	char* q = sentence2;

	printf("ù ��° ���ڿ�? : ");
	gets_s(sentence1, sizeof(sentence1));

	printf("�� ��° ���ڿ�? : ");
	gets_s(sentence2, sizeof(sentence2));
	
	if (strcmp_ic(p, q) == 0) {
		printf("%s�� %s�� �����ϴ�.", *p, *q);
	}
	else printf("%s�� %s�� �ٸ��ϴ�..", *p, *q);
	
	return 0;
}