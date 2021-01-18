/*
 * Pizza.h
 * Base class: Component
 *
 *  Created on: Jan 18, 2021
 *      Author: nquang
 */

#ifndef PIZZA_H_
#define PIZZA_H_

#include <iostream>
using namespace std;

class Pizza {
public:
	virtual ~Pizza(){};
	virtual string getDescription() const = 0;
	virtual string getName() const = 0;
	virtual int getCost() const = 0;
};

#endif /* PIZZA_H_ */
