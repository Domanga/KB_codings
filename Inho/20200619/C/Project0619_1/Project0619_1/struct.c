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

	strcpy(s1.name, "정인호");
	s1.id = 5234760;

	strcpy(c1.name, "Genensis");
	c1.price = 30000000;

	printf("이름 : %s\n", s1.name);
	printf("학번 : %d\n", s1.id);
	
	printf("차량 이름 : %s\n", c1.name);
	printf("차량 가격 : %d\n", c1.price);


	return 0;
}