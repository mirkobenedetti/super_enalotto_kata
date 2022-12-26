
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAXSTACKLENGTH 6

typedef int bool;
#define true 1
#define false 0

struct st {
	int content[MAXSTACKLENGTH];
	int top;
};

typedef struct st SET;

SET numbers;
int i, j, a;

int sizeOf(SET);
void push(int);
bool isNotDuplicated(int);
void addNumbers();
void sortNumbers();
void printNumbers();

int main() {
	srand(time(0));
	numbers.top = -1;
	addNumbers();
	sortNumbers();
	printNumbers();
}

int sizeOf(SET set) {
	return set.top;
}

void push(int element) {
	if(isNotDuplicated(element)) {
		numbers.top++;
		numbers.content[numbers.top] = element;
	}
}

bool isNotDuplicated(int element) {
	if(numbers.top > 0) {
		for (i = numbers.top; i > 0; i--) {
			if (element == numbers.content[i-1]) {
				return false;
			}
		}
	}

	return true;
}

void addNumbers() {
	while(sizeOf(numbers) < 6) {
		push((rand() % 90) + 1);
	}
}

void sortNumbers() {
	for (i = 0; i < 6; ++i) {
		for (j = i + 1; j < 6; ++j) {
			if (numbers.content[i] > numbers.content[j]) {
				a =  numbers.content[i];
				numbers.content[i] = numbers.content[j];
				numbers.content[j] = a;
			}
		}
	}
}

void printNumbers() {
	for(i = 0; i < 6; i++) {
		int number = numbers.content[i];

		if(number < 10) printf("0");
		printf("%d", number);
		if(i < 5) printf(" - ");
	}

	printf("\n");
}
