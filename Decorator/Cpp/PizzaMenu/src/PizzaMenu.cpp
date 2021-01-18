//============================================================================
// Name        : PizzaMenu.cpp
// Author      : quang
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "Barbeque.h"
#include "FreshTomato.h"
#include "PeppyPaneer.h"
#include "Pizza.h"
#include "TopingDecorator.h"
using namespace std;

int main() {
	Pizza * pizza = new PeppyPaneer();
	cout << pizza->getDescription() << endl;
	cout << pizza->getCost() << endl;

	/* PeppyPaneer toping with FreshTomato */
	pizza = new FreshTomato(pizza);
	cout << pizza->getDescription() << endl;
	cout << pizza->getCost() << endl;

	/* PeppyPaneer toping with FreshTomato & Barbeque*/
	pizza = new Barbeque(pizza);
	cout << pizza->getDescription() << endl;
	cout << pizza->getCost() << endl;
}
