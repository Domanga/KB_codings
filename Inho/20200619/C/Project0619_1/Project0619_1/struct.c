#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

struct Student {
	int id;
	char name[30];
};

typedef struct {
	char name[30];
	int price;
}car;

int main() {

	struct Student s1;

	car c1;

	strcpy(s1.name, "����ȣ");
	s1.id = 5234760;

	strcpy(c1.name, "Genensis");
	c1.price = 30000000;

	printf("�̸� : %s\n", s1.name);
	printf("�й� : %d\n", s1.id);
	
	printf("���� �̸� : %s\n", c1.name);
	printf("���� ���� : %d\n", c1.price);


	return 0;
}